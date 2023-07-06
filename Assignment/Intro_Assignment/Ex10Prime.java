import java.util.Scanner;

public class Ex10Prime
{
    public static boolean isPrime(int n) 
    {
        if(n<=1)
        {
            return false;
        }
        for(int divisor=2;divisor<=n/2;divisor++)
        {
            if(n%divisor==0)
            {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) 
    {
        
        Scanner s = new Scanner(System.in);
        System.out.println("Enter The Number : ");
        int n = s.nextInt();
        boolean isPrime = isPrime(n);

        if(isPrime)
        {
            System.out.println(n+ " Is A Prime Number.");
        }
        else
        {
            System.out.println(n+" Is Not A Prime Number.");
        }
        s.close();
    }
}
