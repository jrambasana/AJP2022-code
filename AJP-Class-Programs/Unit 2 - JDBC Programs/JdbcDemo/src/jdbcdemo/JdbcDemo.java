/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author admin
 */
public class JdbcDemo {

   static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
  static final String DB_URL = "jdbc:mysql://localhost/sampledb";
  static final String USER = "root";
  static final String PASS = "";

  public static void main(String[] args) {
    Connection conn = null;
    Statement stmt = null;
    try {
      Class.forName(JDBC_DRIVER);
      conn = DriverManager.getConnection(DB_URL, USER, PASS);
      stmt = conn.createStatement();
      String sql = "SELECT id, first_name, last_name, salary FROM employee";
        try (ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                int id = rs.getInt("id");
                int sal = rs.getInt("salary");
                String first = rs.getString("first_name");
                String last = rs.getString("last_name");
                
                System.out.print("ID: " + id);
                System.out.print(", Salary: " + sal);
                System.out.print(", First Name: " + first);
                System.out.println(", Last : " + last);
            } }
      stmt.close();
      conn.close();
    } catch (SQLException | ClassNotFoundException se) {
    } finally {
      try {
        if (stmt != null)
          stmt.close();
        if (conn != null)
          conn.close();
      } catch (SQLException se) {
      }
    }
  }
    
}
