import java.util.Scanner;

public class Ex41TryCatch 
{
    
    public static void main(String[] args) 
    {
        
        Scanner s= new Scanner(System.in);
        System.out.println("Enter The Age : ");
        int age = s.nextInt();

        try 
        {
            validate(age);
            System.out.println("Welcome To Vote.");
        } 
        catch (Exception e) 
        {
            System.out.println("Exception: " +e.getMessage());
        }
        s.close();
        
    }
    public static void validate(int age) throws ArithmeticException
    {
        if(age<18)
        {
            throw new ArithmeticException("Not Valid");
        }
    }

}
