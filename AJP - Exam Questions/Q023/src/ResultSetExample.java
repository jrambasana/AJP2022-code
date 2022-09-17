import java.sql.*;

public class ResultSetExample {
public static void main(String[] args) {
    // The credentials that we need to have available for the connection to the database.
    String username = "root";
    String password = "";
    String databaseName = "test";

    try {
        Class.forName("com.mysql.jdbc.Driver");
        Connection connect = DriverManager.getConnection("jdbc:mysql://localhost/"
                + databaseName + "?"
                + "user=" + username
                + "&password=" + password);
         Statement statement = connect.createStatement();
         String query = "SELECT * FROM employees";
        ResultSet resultSet = statement.executeQuery(query);
        System.out.println("Printing result...");
        while (resultSet.next()) {
            String name = resultSet.getString("name");
            String city = resultSet.getString("city");
            int salary = resultSet.getInt("salary");
            System.out.println("\tName: " + name + 
                    ", City: " + city + 
                    ", Salary: " + salary);
        }
    } catch (Exception e) {
        e.printStackTrace();
    }
}
}
