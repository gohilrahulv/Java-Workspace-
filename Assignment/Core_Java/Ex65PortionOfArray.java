import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Ex65PortionOfArray 
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        ArrayList<String> color = new ArrayList<>();

        color.add("Red");
        color.add("Blue");
        color.add("Yellow");
        color.add("Orange");
        System.out.println("Original ArrayList : "+color);

        System.out.println("Enter The Starting Index : ");
        int fromindex = s.nextInt();

        System.out.println("Enter The End Index : ");
        int toindex = s.nextInt();

        List<String> portion = color.subList(fromindex, toindex);
        
        System.out.println("Extracted Portion: " + portion);
        s.close();
    }
   

}
