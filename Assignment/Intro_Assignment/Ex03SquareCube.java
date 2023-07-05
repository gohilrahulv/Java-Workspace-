import java.util.Scanner;

public class Ex03SquareCube 
{
    public static void main(String args[])
    {
        int n,b,c;
        System.out.println("Enter the num : ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        System.out.println("Square of "+n+" Is : "+ Math.pow(n, 2));
        System.out.println("Cube of "+n+" Is : "+ Math.pow(n, 3));
        //-------------Second Method----------------
        System.out.println("---------------------------------------------");
        b=n*n;
        c=n*n*n;
        System.out.println("Square of "+n+" Is : "+ b);
        System.out.println("Cube of "+n+" Is : "+ c);
        sc.close();
    }    
}
