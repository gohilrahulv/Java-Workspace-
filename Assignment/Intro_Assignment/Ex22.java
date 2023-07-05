import java.util.Scanner;

public class Ex22 
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        float n1 ,n2;
        System.out.println("Enter The First Num. : ");
        n1 = s.nextFloat();
        
        System.out.println("Enter The Second Num. : ");
        n2 = s.nextFloat();

        System.out.println("\n 1. Addition \n 2. Subtraction \n 3. Multiplication \n 4. Division \n");

         System.out.print("Enter Any ArithmeticOperators : ");
        int arithmetic = s.nextInt(); 

        switch(arithmetic)
        {
            case 1:
            System.out.println("\n Addition is : " + (n1 + n2));
            break;
            case 2:
            System.out.println("\n Subtraction is : " + (n1 - n2));
            break;
            case 3:
            System.out.println("\n Multiplication is : " + (n1 * n2));
            break;
            case 4:
            System.out.println("\n Division is : " + (n1 / n2));
            break;
            default: 
            System.out.println("\n INVALID VALUE...");
            break; 
        }
        s.close();
    }
}
