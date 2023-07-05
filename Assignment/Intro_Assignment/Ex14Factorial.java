import java.util.*;
public class Ex14Factorial
{
    public static void main(String[]args)
    {
        Scanner s =new Scanner(System.in);
       
        System.out.println("Enter the number: ");
        int num=s.nextInt();
        int i=1,fact=1;
        while(i<=num)
        {
            fact=fact*i;
            i++;
        }
        System.out.println("Factorial of the number: "+fact); 
        s.close();
    }
}