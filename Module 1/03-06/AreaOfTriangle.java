import java.util.Scanner;

public class AreaOfTriangle 
{
    public static void main(String args[])
    {
        int h,b;
        System.out.println("Enter The Hight : ");
        Scanner sc = new Scanner(System.in);
        h=sc.nextInt();
        System.out.println("Enter The Base : ");
        Scanner s = new Scanner(System.in);
        b=s.nextInt();
        double area =(h*b)/2;
        System.out.println("Area Of Triangle : "+area);

    }
}
