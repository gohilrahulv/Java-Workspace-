import java.util.Scanner; 

public class SummationFirstLast {
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in); 

        int num, lastDigit, firstDigit; 

        System.out.print("Enter Number : ");
        num = sc.nextInt(); 

        // find first digit
        firstDigit = num; 
        while(firstDigit >= 10){
            firstDigit = firstDigit/10; 
        }

        // find last digit 
        lastDigit = num % 10; 

        System.out.println("First Digit : " + firstDigit);
        System.out.println("Last Digit : " + lastDigit);
        System.out.println("Sum : " + (0-(firstDigit + lastDigit)));
        System.out.println(firstDigit/10);

    }
}
