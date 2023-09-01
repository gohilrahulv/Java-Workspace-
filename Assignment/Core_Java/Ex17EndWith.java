import java.util.Scanner;

public class Ex17EndWith 
{
    
    public static void main(String args[])
    {
        try (Scanner s = new Scanner(System.in)) {
            System.out.print("Enter The String : ");
            String s1 = s.next();
            System.out.print("Enter The Ending Part : ");
            String s2 = s.next();
            System.out.print(s1+" Is End With "+s2+" : "+s1.endsWith(s2));
        }
    }

}
