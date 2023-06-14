import java.util.Scanner;

public class PositiveNagative 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Num : ");
        int n = sc.nextInt();

        if (n>0)
        {
            System.out.println("Positive");
        }
        else if (n<0)
        {
            System.out.println("Nagative");
        }
        else 
        {
            System.out.println("The Number Is 0");
        }

    }
}
