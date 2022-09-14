/**
 * Q027:
 * Write a program to insert a record in a table 
 * using Prepared Statement Object. 
 * SQL - Create Table command:
 * CREATE TABLE `employees` (
 * `id` int(11) NOT NULL,
 * `name` varchar(50) NOT NULL,
 * `city` varchar(50) NOT NULL,
 * `salary` int(11) NOT NULL
 * ) ENGINE=InnoDB DEFAULT CHARSET=latin1;
 */
import java.io.*;
import java.sql.*;
import java.util.*;

public class Q027_PreparedStatementExample {
public static void main(String[] args) {
    try {
        Class.forName("com.mysql.jdbc.Driver");
        Connection cn =      	     
            DriverManager.getConnection
            ("jdbc:mysql://localhost:3306/test", "root", "");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Employee ID: ");
        String eid = sc.next();
        System.out.print("Enter Employee Name: ");
        String en = sc.next();
        System.out.print("Enter Employee City: ");
        String ec = sc.next();
        System.out.print("Enter Employee Salary: ");
        String es = sc.next();
        PreparedStatement smt = cn.prepareStatement
                ("insert into employees values(?,?,?,?)");
        smt.setString(1, eid);
        smt.setString(2, en);
        smt.setString(3, ec);
        smt.setString(4, es);
        smt.executeUpdate();
        System.out.println("Record Submitted....");
        cn.close();
    } 
    catch (Exception e) 
    {
        System.out.println(e);
    }
}
}
