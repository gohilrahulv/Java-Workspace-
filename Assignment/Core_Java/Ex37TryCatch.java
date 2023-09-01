import java.util.Scanner;

public class Ex37TryCatch 
{
    
    public static void main(String args[])
    {
        Scanner s= new Scanner (System.in);
        try 
        {
            System.out.print("a = ");
            int a = s.nextInt();

            System.out.print("b = ");
            int b = s.nextInt();
            
            int c=a/b;
            System.out.println(c);
        } 
        catch(ArithmeticException e)
        {
            e.printStackTrace();
        }
        System.out.println("Done!!");
        s.close();
    }
}
