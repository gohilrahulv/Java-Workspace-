package Assignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class Ex15 {
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
            String query = "SELECT * FROM emp_tabel WHERE sal IN (SELECT sal FROM emp_tabel WHERE ename IN ('FORD', 'SMITH')) ORDER BY sal DESC";

            // Execute the query
            ResultSet rs = smt.executeQuery(query);
            
            System.out.println("Empno\tEname\tSal");
            System.out.println("-----\t-----\t-----");

            // Iterate through the result set and print employee details
            while (rs.next()) {
            	int empno = rs.getInt("empno");
                String ename = rs.getString("ename");
                double sal = rs.getDouble("sal");
                
                
                
                // ... (Retrieve other columns as needed)

                System.out.println(empno + "\t" + ename + "\t" + sal);
                // Print other details as needed
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