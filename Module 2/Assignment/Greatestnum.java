import java.util.Scanner;

public class Greatestnum
{
    public static void main(String args[])
    {
        
        Scanner s = new Scanner(System.in);
        System.out.println("Enter The 1st Num : ");
        int a = s.nextInt();
        System.out.println("Enter The 2nd Num : ");
        int b = s.nextInt();
        System.out.println("Enter The 3rd Num : ");
        int c = s.nextInt();
        if(a>b && a>c)
        {
            System.out.println(a);
        }
        else if (b>a && b>c)
        {
            System.out.println(b);
        }
        else
        {
            System.out.println(c);
        }

         
    }
}