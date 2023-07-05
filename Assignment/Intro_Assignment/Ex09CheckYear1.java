import java.util.Scanner;

public class Ex09CheckYear1 
{
    public static void main(String[]args)
    {
        int year;
        System.out.println("Enter The Year: ");
        Scanner sc =new Scanner(System.in);
        year =sc.nextInt();
         if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) 
        {
 
            // Both conditions true- Print leap year
            System.out.println(year + " Is Leap Year");
        }
        else 
        {
            System.out.println(year + " Is Not A Leap Year");
        }
        sc.close();
    }    
}
