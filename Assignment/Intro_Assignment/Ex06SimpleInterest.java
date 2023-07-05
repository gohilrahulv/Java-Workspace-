import java.util.Scanner;

public class Ex06SimpleInterest 
{
    public static void main(String args[])
    {
        float p, r, t,si;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the Principal : ");
        p = s.nextFloat();
        System.out.print("Enter the Rate of interest : ");
        r = s.nextFloat();
        System.out.print("Enter the Time period : ");
        t = s.nextFloat();
        si = (r * t * p) / 100;
        System.out.print("The Simple Interest is : " + si);
        s.close();
    }
}
