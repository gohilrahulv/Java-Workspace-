package Assignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;



public class Ex17 {
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
            String query = "SELECT DISTINCT job FROM emp_tabel WHERE deptno = 10 AND job NOT IN (SELECT DISTINCT job FROM emp_tabel WHERE deptno = 20);";

            // Execute the query
            ResultSet rs = smt.executeQuery(query);
            
            // Print the header
            System.out.println("Jobs Of Deptno 10 Those That Are Not Found In Deptno 20");
            System.out.println("Job");
            System.out.println("---------------");

            // Iterate through the result set and print employee information
            while (rs.next()) {
                String job = rs.getString("job");
                

                System.out.println(job);
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
