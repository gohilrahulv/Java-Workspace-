package Assignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Ex23




{
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
            String query = "SELECT * FROM emp_tabel WHERE sal > (SELECT sal FROM emp_tabel WHERE ename = 'BLAKE');";

            // Execute the query
            ResultSet rs = smt.executeQuery(query);
            
            // Print the header
            System.out.println("Empno\tEname\tJob\t\tSal");

            // Iterate through the result set and print employee details
            while (rs.next()) {
                int empNo = rs.getInt("Empno");
                String ename = rs.getString("Ename");
                String job = rs.getString("Job");
                double sal = rs.getDouble("Sal");

                System.out.println(empNo + "\t" + ename + "\t" + job + "\t\t" + sal);
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
