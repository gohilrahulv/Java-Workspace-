import java.util.Scanner;

public class Ex10OddEven 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Num : ");
        int i = sc.nextInt();

        if (i%2==0)
        {
            System.out.println("The Number Is Even.");
        }
        else
        {
            System.out.println("The Number Is Odd.");
        }
        sc.close();
    }    
}
