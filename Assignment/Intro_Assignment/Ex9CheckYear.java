import java.util.Scanner;

public class Ex9CheckYear 
{
    public static void main(String[] args) 
    {
        Scanner s= new Scanner (System.in);
        System.out.println("Enter The Year : ");
        int year = s.nextInt();
        if (year%400==0)
        {
            System.out.println(year+" Is Leap Year.");
        }   
        else if (year%100==0)
        {
            System.out.println(year+" Is Not Leap Year.");
        }
        else if(year%4==0)
        {
            System.out.println(year+" Is Leap Year.");
        }
        else
        {
            System.out.println(year +" Is Not Leap Year.");
        } 
        s.close();
    }
}
