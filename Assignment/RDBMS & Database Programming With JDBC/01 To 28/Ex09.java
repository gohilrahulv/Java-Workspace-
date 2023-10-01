package Assignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DecimalFormat;


public class Ex09 {
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
            String query = "SELECT empno, ename, sal,(sal * 12) AS Annsal FROM emp_tabel WHERE sal * 12 BETWEEN 22000 AND 45000;";

            // Execute the query
            ResultSet rs = smt.executeQuery(query);
            DecimalFormat decimalFormat = new DecimalFormat("#,###.00");

            // Print the header
            System.out.println("Empno\tEname\tSal\tAnnsal");

            // Iterate through the result set and print employee information
            while (rs.next()) {
                int empno = rs.getInt("Empno");
                String ename = rs.getString("Ename");
                double sal = rs.getDouble("Sal");
                double annSal = rs.getDouble("Annsal");

                System.out.println(empno + "\t" + ename + "\t" + decimalFormat.format(sal) + "\t" + decimalFormat.format(annSal));
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
