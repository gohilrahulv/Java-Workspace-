import java.util.ArrayList;
import java.util.Scanner;

public class Ex55ArrayList 
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);


        ArrayList<String> color = new ArrayList<>();
        
        color.add("Red");
        color.add("Blue");
        color.add("Yellow");
        color.add("Orange"); 

        System.out.println("Original Array List : "+color);

        System.err.println("Enter the element to search : ");
        String indextosearch = s.next();

        int index = color.indexOf(indextosearch);

        if(index != -1)
        {
            System.out.println(indextosearch+" Element Found At "+index);
        }
        else
        {
            System.out.println("Element not found in the ArrayList.");
        }
        s.close();
    }    
}
