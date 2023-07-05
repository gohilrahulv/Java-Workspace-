import java.util.Scanner;

public class Ex18FindMax 
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter The Number : ");
        int num = s.nextInt();

        int max =num%10;
        while(num>0)
        {
            if(num%10>max)
            {
                max=num%10;
            }
            num = num/10;
        }
        System.out.println("Max Digit Is : "+max);
        s.close();
    }
}
