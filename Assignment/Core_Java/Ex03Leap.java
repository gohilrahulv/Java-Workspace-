import java.util.Scanner;

public class Ex03Leap 
{
    public static void main(String args[])
    {
        int i;
        try (Scanner s2 = new Scanner(System.in)) {
            System.out.println("Enter The Year : ");
            i = s2.nextInt();
        }
        if (i%4==0)
       {
            if(i%100==0)
            {
                
                if (i%400!=0)
                {
                    System.out.println(i+ " Is Leap Year.");
                }
                else
                {
                    System.out.println(i+" Is Not Leap Year.");
                }
                
            }
            System.out.println(i +" Is Leap Year");
       }
       else
       {
        System.out.println(i +" Is Not Leap Year.");
       }
    }    
}
