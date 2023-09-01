import java.util.Scanner;

public class Ex16StringComparison 
{
    
    public static void main(String args[])
    {
        try (Scanner s = new Scanner(System.in)) {
            System.out.println("Enter The First String : ");
            String s1 =s.next();
            System.out.println("Enter The Second String : ");
            String s2= s.next();
            System.out.println("Both String is Same : "+s1.equals(s2));
        }
    }

}
