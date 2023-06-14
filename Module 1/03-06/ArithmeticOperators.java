import java.util.Scanner;
                 
public class ArithmeticOperators
{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      int num1, num2, Add,Sub,Multi;
      float Div;
      
      System.out.println("Enter the First Number: ");
      num1 = scan.nextInt();
      System.out.println("Enter the Second Number: ");
      num2 = scan.nextInt();
      
      Add = num1 + num2;
      System.out.println("\nAddition Result = " + Add);
      Sub = num1 - num2;
      System.out.println("Subtraction Result = " + Sub);
      Multi = num1 * num2;
      System.out.println("Multiplication Result = " + Multi);
      Div = num1 / num2;
      System.out.println("Division Result = " + Div);
   }
}