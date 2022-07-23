/*
 Transfer amount from one account to another

create following table and insert 2 records

CREATE TABLE `customer` (
  `cid` int(11) NOT NULL,
  `acct_no` varchar(1) NOT NULL,
  `name` varchar(10) NOT NULL,
  `balance` int(11) NOT NULL
);

INSERT INTO `customer` (`cid`, `acct_no`, `name`, `balance`) VALUES
(1, 'A', 'Taru', 10000);

INSERT INTO `customer` (`cid`, `acct_no`, `name`, `balance`) VALUES
(2, 'B', 'Merry', 2000);
 */

/**
 *
 * @author admin
 */

import java.util.Scanner;
import java.sql.*; 


public class MoneyTransfer {


 public static void main(String[] args) throws Exception{  
      
    Class.forName("com.mysql.jdbc.Driver");  
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost/MU","root","");
    
        con.setAutoCommit(false);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your account number : ");
        String acct_no1 = sc.next();
        
        System.out.println("Enter amount to be transfer : ");
        int trasfer = sc.nextInt();
        
        System.out.println("Enter third party account number : ");
        String acct_no2 = sc.next();
        String sql1 = "select * from customer where acct_no = ?";
        PreparedStatement ps1 = con.prepareStatement(sql1);
        ps1.setString(1, acct_no1);
        ResultSet rs1 = ps1.executeQuery();
        rs1.next();
        
        int bal_a = rs1.getInt("balance");
        System.out.println("Balance before transfer in your account: " + bal_a);
        bal_a = bal_a - trasfer;
      
        
        String sql2 = "update customer set balance=? where acct_no=?";
        PreparedStatement ps2 = con.prepareStatement(sql2);
        
        ps2.setInt(1, bal_a);
        ps2.setString(2, acct_no1);
        ps2.executeUpdate();
        System.out.println("Balance after transfer in your account: " + bal_a);
        
        String sql3 = "select * from customer where acct_no = ?";
        PreparedStatement ps3 = con.prepareStatement(sql3);
        ps3.setString(1, acct_no2);
        ResultSet rs3 = ps3.executeQuery();
        rs3.next();
        int bal_b = rs3.getInt("balance");
        
        
        System.out.println("Balance before transfer balance in third party account: " + bal_b);
        bal_b = bal_b + trasfer;
       
        
        String sql4 = "update customer set balance=? where acct_no=?";
        PreparedStatement ps4 = con.prepareStatement(sql4);
        
        ps4.setInt(1, bal_b);
        ps4.setString(2, acct_no2);
        ps4.executeUpdate();
        System.out.println("Balance after transfer balance in third party account: " + bal_b);
        con.commit();
        con.close();
 }    
}
