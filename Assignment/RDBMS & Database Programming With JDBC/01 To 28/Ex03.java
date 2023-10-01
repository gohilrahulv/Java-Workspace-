package Assignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.*;


public class Ex03 {
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

            // Define the SQL query to retrieve unique job titles in descending order
            String query = "SELECT DISTINCT job FROM emp_tabel ORDER BY job DESC";

            // Execute the query
            ResultSet rs = smt.executeQuery(query);

            // Store unique job titles in a list
            List<String> uniqueJobTitles = new ArrayList<>();
            while (rs.next()) {
                String jobTitle = rs.getString("Job");
                uniqueJobTitles.add(jobTitle);
            }

            // Close resources
            rs.close();
            smt.close();
            con.close();

            // Sort the list in descending order
            Collections.sort(uniqueJobTitles, Collections.reverseOrder());

            // Display unique job titles
            for (String job : uniqueJobTitles) {
                System.out.println(job);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
