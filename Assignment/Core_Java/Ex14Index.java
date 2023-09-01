import java.util.Scanner;

public class Ex14Index 
{
    public static void main(String args[])
    {
        String s = "Tops Technologies";

        char charAt1 = s.charAt(0);
        char charAt2 = s.charAt(10);

        System.out.println("Original String: " + s);
        System.out.println("The character at position " + 0 + " is " + charAt1);
        System.out.println("The character at position " + 10 + " is " + charAt2);
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Char At : ");
        int i = sc.nextInt();
        char charAt3= s.charAt(i);
        System.out.println(charAt3);
        sc.close();
    }
}
