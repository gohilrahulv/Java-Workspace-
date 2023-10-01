package Assignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;



public class Ex26 {
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
            String quary = "ALTER TABLE student_tabel ADD COLUMN IF NOT EXISTS pin BIGINT";
            

            // Execute the SQL query to add the new column

            smt.executeUpdate(quary);

            System.out.println("Column 'Pin' added successfully.");
            

            // Close resources
            
            smt.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
