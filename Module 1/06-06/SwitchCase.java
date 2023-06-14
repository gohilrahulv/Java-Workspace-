import java.util.Scanner;

public class SwitchCase 
{
    public static void main(String args[])
    {
        Scanner s = new Scanner (System.in);
        System.out.println("Enter The Num : ");
        int i = s.nextInt();
        String day;
        switch(i)
        {
            case 1:
            day="Monday";
            break;
            
            case 2:
            day="Tuesday";
            break;

            case 3:
            day="Wednesday";
            break;

            case 4:
            day="Thursday";
            break;

            case 5:
            day="Friday";
            break;

            case 6:
            day="Saturday";
            break;

            case 7:
            day="Sunday";
            break;

            default:
            day="Invalid Day Number";
            break;
        }
        System.out.println("The Day Is : "+ day);
    }    
}
