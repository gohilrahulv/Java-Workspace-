import java.util.HashMap;
import java.util.Map;


public class Ex63Mapping 
{
    public static void main(String[] args) 
    {
        Map<String,Integer> color = new HashMap<>();

        color.put("Red",4);
        color.put("Blue",2);
        color.put("Yellow",6);
        color.put("Orange",0);
        
        int size = color.size();

        System.out.println("Number of key-value mappings in the map: " + size);
    }    
}
