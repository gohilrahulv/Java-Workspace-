import java.util.Scanner;

public class Result 
{
    public static void main(String args[])
    {
        float s1,s2,s3,s4,s5,total;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Marks Of 1st Sub : ");
        s1 =sc.nextFloat();
        System.out.println("Enter The Marks Of 2nd Sub : ");
        s2 =sc.nextFloat();
        System.out.println("Enter The Marks Of 3rd Sub : ");
        s3 =sc.nextFloat();
        System.out.println("Enter The Marks Of 4th Sub : ");
        s4 =sc.nextFloat();
        System.out.println("Enter The Marks Of 5th Sub : ");
        s5 =sc.nextFloat();
        total=s1+s2+s3+s4+s5;
        System.out.println("Sum Of All Sub Is : "+total);
        float percentage;
        percentage = total/5;
        System.out.println("The Percentage Of Student Is  :"+percentage);

    }
}
