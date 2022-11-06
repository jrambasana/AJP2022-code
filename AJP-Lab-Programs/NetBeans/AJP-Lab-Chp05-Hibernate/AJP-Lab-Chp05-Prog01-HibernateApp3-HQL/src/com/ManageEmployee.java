package com;
import com.Employee;
import java.util.Iterator;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ManageEmployee {
   private static SessionFactory factory; 
   public static void main(String[] args) {
      try {
         factory = new Configuration().configure().buildSessionFactory();
      } catch (Throwable ex) { 
         System.err.println("Failed to create sessionFactory object." + ex);
         throw new ExceptionInInitializerError(ex); 
      }
      
      ManageEmployee ME = new ManageEmployee();

      System.out.println("\nListing existing employees.");
      /* List down all the employees */
      ME.listEmployees();
      System.out.println("-------------------------------\n");

      System.out.println("\nAdding 3 new employees.");
      /* Add few employee records in database */
      Integer empID1 = ME.addEmployee("Lucky", "Ducky", 1000);
      Integer empID2 = ME.addEmployee("Jack", "Pack", 5000);
      Integer empID3 = ME.addEmployee("Tombie", "Zombie", 10000);
      System.out.println("-------------------------------");

      System.out.println("\nListing employees after Adding 3 new employees.");
      /* List down all the employees */
      ME.listEmployees();
      System.out.println("-------------------------------");

      System.out.println("\nUpdating employee 1 from the newly added 3 employees.");
      /* Update employee's records */
      ME.updateEmployee(empID1, 17000);
      System.out.println("-------------------------------");

      System.out.println("\nDeleting employee 2 from the newly added 3 employees.");
      /* Delete an employee from the database */
      ME.deleteEmployee(empID2);
      System.out.println("-------------------------------");

      System.out.println("\nListing employees after updating and deleting operations.");
      /* List down new list of the employees */
      ME.listEmployees();
      System.out.println("-------------------------------");
      
      System.exit(0);
   }
   
   /* Method to add an employee in the database */
   public Integer addEmployee(String fname, String lname, int salary){
      Session session = factory.openSession();
      Transaction tx = null;
      Integer employeeID = null;
      
      try {
         tx = session.beginTransaction();
         Employee employee = new Employee(fname, lname, salary);
         employeeID = (Integer) session.save(employee); 
         tx.commit();
      } catch (HibernateException e) {
         if (tx!=null) tx.rollback();
         e.printStackTrace(); 
      } finally {
         session.close(); 
      }
      return employeeID;
   }
   
   /* Method to  READ all the employees */
   public void listEmployees( ){
      Session session = factory.openSession();
      Transaction tx = null;
      
      try {
         tx = session.beginTransaction();
         String hql="FROM Employee";
         Query q=session.createQuery(hql);
         List employees=q.list();
         //List employees = session.createQuery("FROM Employee").list(); 
         for (Iterator iterator = employees.iterator(); iterator.hasNext();){
            Employee employee = (Employee) iterator.next(); 
            System.out.print("Employee ID: " + employee.getId()); 
            System.out.print("\t First Name: " + employee.getFirstName()); 
            System.out.print("\t Last Name: " + employee.getLastName()); 
            System.out.println("\t Salary: " + employee.getSalary()); 
         }
         tx.commit();
      } catch (HibernateException e) {
         if (tx!=null) tx.rollback();
         e.printStackTrace(); 
      } finally {
         session.close(); 
      }
   }
   
   /* Method to UPDATE salary for an employee */
   public void updateEmployee(Integer EmployeeID, int salary ){
      Session session = factory.openSession();
      Transaction tx = null;
      
      try {
         tx = session.beginTransaction();
         Employee employee = (Employee)session.get(Employee.class, EmployeeID); 
         employee.setSalary( salary );
		 session.update(employee); 
         tx.commit();
      } catch (HibernateException e) {
         if (tx!=null) tx.rollback();
         e.printStackTrace(); 
      } finally {
         session.close(); 
      }
   }
   
   /* Method to DELETE an employee from the records */
   public void deleteEmployee(Integer EmployeeID){
      Session session = factory.openSession();
      Transaction tx = null;
      
      try {
         tx = session.beginTransaction();
         Employee employee = (Employee)session.get(Employee.class, EmployeeID); 
         session.delete(employee); 
         tx.commit();
      } catch (HibernateException e) {
         if (tx!=null) tx.rollback();
         e.printStackTrace(); 
      } finally {
         session.close(); 
      }
   }
}