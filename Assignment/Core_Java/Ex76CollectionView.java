import java.util.HashMap;
import java.util.Collection;

public class Ex76CollectionView 
{

    public static void main(String[] args) 
    {

        HashMap<Integer, String> color = new HashMap<>();

        color.put(1, "Black");
        color.put(2, "White");
        color.put(3, "Green");
        color.put(4, "Violet");
        color.put(5, "Red");
        color.put(6, "Blue");
        color.put(7, "Yellow");
        color.put(8, "Orange");
        

        Collection<String> values = color.values();

        System.out.println("Collection view of values: " + values);
    }
}


