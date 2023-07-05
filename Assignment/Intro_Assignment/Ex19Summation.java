import java.util.Scanner;

public class Ex19Summation 
{
    public static void main(String[] args) 
    {

        Scanner sc = new Scanner(System.in); 

        int num, remainder, sum=0; 

        System.out.print("Enter Number : ");
        num = sc.nextInt(); 

        while(num > 0)
        {
            remainder = num % 10; 
            sum = sum - remainder; 
            num = num / 10; 
        }
        System.out.println("Summation of Digits : " + sum);
        sc.close();
    }
}
