
import java.util.Scanner;

public class Ex08DigitCounter 
{

	public static void main(String[] args) {
		
		int num, count = 0; 
		
		try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Input an integer number");
            num = sc.nextInt();
        } 
		
		if(num == 0)
        {
            System.out.println("Number of digits in the number: "+1);
        }
		else if(num >=1000000)
        {
            System.out.println("Error : Please Enter The Num Less Then Billion...!!");
        }
        else
        {
		    while(num != 0)
            {
			num /= 10; 
			++count; 
		    }
			System.out.println("Number of digits in the number: " + count);
        }   
		
		
	}
}