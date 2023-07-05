import java.util.Scanner;

public class Ex04AreaOfCircle 
{
    public static void main(String args[])
    {
    int a;
    System.out.println("Enter The Radius Of Circle : ");
    Scanner sc = new Scanner(System.in);
    a = sc.nextInt();
    double area = (22*a*a)/7;
    System.out.println("The Area Of Circle Is : "+ area);
    sc.close();
    }
}
