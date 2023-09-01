import java.util.ArrayList;
import java.util.Collections;



public class Ex56ArrayList 
{
    public static void main(String[] args) 
    {
       


        ArrayList<String> color = new ArrayList<>();
        
        color.add("Red");
        color.add("Blue");
        color.add("Yellow");
        color.add("Orange"); 

        System.out.println("Original Array List : "+color);

        Collections.sort(color);

        System.out.println("Sorted ArrayList: " + color);
    }    
}
