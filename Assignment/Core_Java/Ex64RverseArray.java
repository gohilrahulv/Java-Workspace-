import java.util.ArrayList;
import java.util.Collections;

public class Ex64RverseArray 
{
    public static void main(String[] args) 
    {
        
        ArrayList<String> color = new ArrayList<>();

        color.add("Red");
        color.add("Blue");
        color.add("Yellow");
        color.add("Orange");
        System.out.println("Original ArrayList : "+color);

        Collections.reverse(color);

        System.out.println("Reversed ArrayList : "+color);
    }
   

}
