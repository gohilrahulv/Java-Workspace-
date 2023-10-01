package Assignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class Ex02 {
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
         // Define the SQL query to retrieve employee details with sorting
            String quary = "SELECT * FROM emp_tabel ORDER BY deptno ASC";

            // Execute the query
            ResultSet rs = smt.executeQuery(quary);

            // Iterate through the result set and print employee details
            while (rs.next()) {
                int deptno = rs.getInt("deptno");
                String ename = rs.getString("ename");
                
                // ... (Retrieve other columns as needed)

                System.out.println("Ename: " + ename+",\t Deptno : "+deptno);
                
                    
            }
        
        }
            catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("========================================================");
        try {
        	Class.forName("com.mysql.jdbc.Driver");
            // Establish a database connection
            Connection con = DriverManager.getConnection(url, "root", "");

            // Create a SQL statement
            Statement smt = con.createStatement();

            // Define the SQL query to select unique job titles
         // Define the SQL query to retrieve employee details with sorting
            String quary = "SELECT * FROM emp_tabel ORDER BY job DESC";

            // Execute the query
            ResultSet rs = smt.executeQuery(quary);

            // Iterate through the result set and print employee details
            while (rs.next()) {
                String job = rs.getString("job");
                String ename = rs.getString("ename");
                
                // ... (Retrieve other columns as needed)

                System.out.println("Ename: " + ename+",\t Job : "+job);
                
                    
            }
        
        }
            catch (Exception e) {
            e.printStackTrace();
        }
    }
}
