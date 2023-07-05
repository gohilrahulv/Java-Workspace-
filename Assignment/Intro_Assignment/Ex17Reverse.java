import java.util.Scanner;
public class Ex17Reverse 
{
    public static void main(String[]args)
    {   int reverse1=0;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter The Number : ");
        int n =sc.nextInt();
        while(n !=0)
        {
            int r = n%10;
            reverse1 = reverse1*10+r;
            n=n/10;
            
        }
        System.out.println("The reverse of the given number is: " + reverse1);  
        sc.close(); 
    }
}
