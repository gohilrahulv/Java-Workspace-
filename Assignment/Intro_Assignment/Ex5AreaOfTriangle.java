import java.util.Scanner;

public class Ex5AreaOfTriangle 
{
    public static void main(String args[])
    {
        int h,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Hight : ");
        h=sc.nextInt();
        System.out.println("Enter The Base : ");
        b=sc.nextInt();
        sc.close();
        double area =(h*b)/2;
        System.out.println("Area Of Triangle : "+area);
       
    }
}
