
import java.sql.*;
import java.util.Scanner;

public class CourseManagement {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        while (true) {
            System.out.println("----------------------------");
            System.out.println("|Course Management System|");
            System.out.println("----------------------------");
            System.out.println("---------------------------------------------------------------------------------------------------");
            System.out.println("| 1.Add Course || 2.View Course || 3.Search Course || 4.Update Course || 5.Delete Course || 6.Exit |");
            System.out.println("---------------------------------------------------------------------------------------------------");

            int choice = s.nextInt();
            s.nextLine();

            switch (choice) {
                case 1:
                    new AddCourse();
                    break;
                case 2:
                    new ViewCourses();
                    break;
                case 3:
                    new SearchCourse();
                    break;
                case 4:
                    new UpdateCourse();
                    break;
                case 5:
                    new DeleteCourse();
                    break;
                case 6:
                    System.out.println("Exiting The Program.");
                    s.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid Choice. Please Try Again.");
            }
        }
    }
}

class AddCourse {
    public AddCourse() {
        Scanner sc = new Scanner(System.in);
        String host = "jdbc:mysql://localhost:3306/";
        String db = "studentmanagement";
        String url = host + db;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, "root", "");

            System.out.print("Enter The Name : ");
            String name = sc.nextLine();

            System.out.print("Enter The fees : ");
            String fees = sc.nextLine();

            System.out.print("Enter The duration : ");
            String duration = sc.nextLine();

            System.out.print("Enter The detail : ");
            String detail = sc.nextLine();

            String query = "INSERT INTO courses values (null,'" + name + "','" + fees + "','" + duration + "','" + detail + "')";

            Statement smt = con.createStatement();

            int data = smt.executeUpdate(query);
            if (data > 0) {
                System.out.println("Course Added Successfully!!!");
            } else {
                System.out.println("Error");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class ViewCourses {
    public ViewCourses() {
        String host = "jdbc:mysql://localhost:3306/";
        String db = "studentmanagement";
        String url = host + db;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, "root", "");

            String sql = "SELECT * FROM courses";

            Statement smt = con.createStatement();

            ResultSet set = smt.executeQuery(sql);

            System.out.println("ID" + "\t" + "NAME" + "\t\t" + "FEES" + "\t\t" + "DURATION" + "\t" + "DETAILS");

            while (set.next()) {
                int id = set.getInt(1);
                String name = set.getString(2);
                String fees = set.getString(3);
                String duration = set.getString(4);
                String details = set.getString(5);

                System.out.println(id + "\t" + name + "\t\t" + fees + "\t\t" + duration + "\t\t" + details);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class SearchCourse {
    public SearchCourse() {
        Scanner sc = new Scanner(System.in);
        String host = "jdbc:mysql://localhost:3306/";
        String db = "studentmanagement";
        String url = host + db;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, "root", "");

            System.out.println("Enter ID To Search Course : ");

            int id = sc.nextInt();

            String query = "SELECT * FROM courses WHERE id ='" + id + "'";

            Statement smt = con.createStatement();
            ResultSet set = smt.executeQuery(query);
            if (!set.next()) {
                System.out.println("No Data Found Enter The Valid Id....");
            } else {
                System.out.println("ID" + "\t" + "NAME" + "\t\t" + "FEES" + "\t\t" + "DURATION" + "\t" + "DETAILS");
                int id1 = set.getInt(1);
                String name = set.getString(2);
                String fees = set.getString(3);
                String duration = set.getString(4);
                String details = set.getString(5);
                System.out.println(id1 + "\t" + name + "\t\t" + fees + "\t\t" + duration + "\t\t" + details);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class UpdateCourse {
    public UpdateCourse() {
        Scanner sc = new Scanner(System.in);
        String host = "jdbc:mysql://localhost:3306/";
        String db = "studentmanagement";
        String url = host + db;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, "root", "");

            System.out.println("Enter ID To Search Course : ");

            int id = sc.nextInt();
            sc.nextLine();

            String query = "SELECT * FROM courses WHERE id ='" + id + "'";
            Statement smt = con.createStatement();
            ResultSet set = smt.executeQuery(query);

            if (!set.next()) {
                System.out.println("No Data Found");
            } else {
                System.out.println("-------------------------------");
                System.out.println("This Is Your Old Course Details");
                System.out.println("-------------------------------");
                System.out.println("ID" + "\t" + "NAME" + "\t\t" + "FEES" + "\t\t" + "DURATION" + "\t" + "DETAILS");

                int id1 = set.getInt(1);
                String name = set.getString(2);
                String fees = set.getString(3);
                String duration = set.getString(4);
                String details = set.getString(5);

                System.out.println(id1 + "\t" + name + "\t\t" + fees + "\t\t" + duration + "\t\t" + details);
                System.out.println("===========================================");
                System.out.print("Enter The Name : ");
                String name1 = sc.nextLine();

                System.out.print("Enter The fees : ");
                String fees1 = sc.nextLine();

                System.out.print("Enter The duration : ");
                String duration1 = sc.nextLine();

                System.out.print("Enter The detail : ");
                String details1 = sc.nextLine();

                String query1 = "UPDATE courses SET name=?, fees=?, duration=?, details=? WHERE id=?";

                PreparedStatement prs = con.prepareStatement(query1);
                prs.setString(1, name1);
                prs.setString(2, fees1);
                prs.setString(3, duration1);
                prs.setString(4, details1);
                prs.setInt(5, id);
                int data =prs.executeUpdate();
                if(data>0)
                {
                	System.out.println("Course Updated Successfully!");
                } else {
                    System.out.println("Failed To Update The Course.");
                }
                
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class DeleteCourse {
    public DeleteCourse() {
        Scanner sc = new Scanner(System.in);
        String host = "jdbc:mysql://localhost:3306/";
        String db = "studentmanagement";
        String url = host + db;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, "root", "");

            System.out.println("Enter ID To Delete Course");
            int id = sc.nextInt();

            String query = "DELETE FROM courses WHERE id='" + id + "'";

            Statement smt = con.createStatement();
            int set = smt.executeUpdate(query);
            if (set == 0) {
                System.out.println("No Data Found Enter The Valid Id....");
            } else {
                System.out.println("Course Deleted Successfully!!!!");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
