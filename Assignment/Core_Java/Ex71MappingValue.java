import java.util.HashMap;
import java.util.Map;

public class Ex71MappingValue 
{
    public static void main(String[] args) 
    {
    
        Map<String,Integer> map = new HashMap<>();

        boolean isEmpty = map.isEmpty();
        if(isEmpty)
        {
            System.out.println("This map Is Empty!!!");
        }
        else
        {
            System.out.println("Map Is Not Empty!!!");
        }

        map.put("Apple", 10);
        map.put("Orange", 5);


        isEmpty = map.isEmpty();

        if(isEmpty)
        {
            System.out.println("This map Is Empty!!!");
        }
        else
        {
            System.out.println("Map Is Not Empty!!!");
        }

    }    
}

/*
 * This map Is Empty!!!
 * Map Is Not Empty!!!
 */
