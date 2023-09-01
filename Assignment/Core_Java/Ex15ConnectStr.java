import java.util.Scanner;

public class Ex15ConnectStr 
{

    public static void main(String args[])
    {
        try (Scanner s = new Scanner(System.in)) {
            System.out.println("Enter The Name : ");
            String s1= s.next();
            System.out.println("Enter The Surename : ");
            String s2= s.next().concat(s1);
            System.out.println("Hello " + s2 +" !!!");
        }
    }

}
