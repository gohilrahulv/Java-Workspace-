
public class Ex40TryCatch 

{

    public static void main(String[] args) 
    {
        if (args.length != 2) 
        {
            System.out.println("Please provide two numbers as command line arguments.");
            return;
        }

        try 
        {
            int num1 = Integer.parseInt(args[0]);
            int num2 = Integer.parseInt(args[1]);

            int result = num1 / num2;
            System.out.println("Division result: " + result);
        } 
        catch (NumberFormatException e) 
        {
            System.out.println("Invalid input. Please provide valid integers.");
        } 
        catch (ArithmeticException e) 
        {
            System.out.println("Arithmetic Exception: " + e.getMessage());
            System.out.println("Division by zero is not allowed.");
        }
        
    }
}
