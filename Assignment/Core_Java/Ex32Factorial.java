import java.util.Scanner;

public class Ex32Factorial 
{
    
    
    public static int calculateFactorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers");
        }

        int factorial = 1;
        for (int i = 2; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a non-negative number: ");
        int num = s.nextInt();

        int factorial = calculateFactorial(num);
        System.out.println("The factorial of " + num + " is " + factorial);
        s.close();
    }

}
