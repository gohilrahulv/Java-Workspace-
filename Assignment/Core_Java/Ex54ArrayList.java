import java.util.ArrayList;
import java.util.Scanner;

public class Ex54ArrayList 
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        ArrayList<String> color = new ArrayList<>();

        color.add("Red");
        color.add("Blue");
        color.add("Yellow");
        color.add("Orange"); 

        System.out.println("Old ArrayList : "+color);
        System.out.println("Enter Index To Remove Element : ");
        int indextoremove = s.nextInt();

        
        if(indextoremove>=0 && indextoremove<=color.size())
        {
            color.remove(indextoremove);
        }
        else
        {
            System.out.println("Invalid Index!!");
        }
        System.out.println("Updated ArrayList : "+color);
        s.close();
    }
    
}
