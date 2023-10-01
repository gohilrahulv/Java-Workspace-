package Assignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class Ex19 {
    public static void main(String[] args) {
        String host = "jdbc:mysql://localhost:3306/";
        String db = "rdbms";
        String url = host+db;
       

        try {
        	//load the MySQL JDBC driver class
        	Class.forName("com.mysql.jdbc.Driver");
            // Establish a database connection
            Connection con = DriverManager.getConnection(url, "root", "");

            // Create a SQL statement
            Statement smt = con.createStatement();

            // Define the SQL query to select unique job titles
            String query = "SELECT MAX(sal) AS High FROM emp_tabel";

            // Execute the query
            ResultSet rs = smt.executeQuery(query);
            
 

            // Iterate through the result set and print employee details
            if (rs.next()) {
                double highestSalary = rs.getDouble("High");
                System.out.println("The highest salary in the EMP table is: " + highestSalary);
            } else {
                System.out.println("No data found in the EMP table.");
            }

            // Close resources
            rs.close();
            smt.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
