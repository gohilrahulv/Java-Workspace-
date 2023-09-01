import java.util.HashMap;
import java.util.Map;

public class Ex60IterateElement 
{
    public static void main(String[] args) 
    {
        HashMap<Integer, String> hashList = new HashMap<>();

        hashList.put(1, "Apple");
        hashList.put(2, "Banana");
        hashList.put(3, "Orange");
        hashList.put(4, "Grapes");
        hashList.put(5, "Mango");

        for (Map.Entry<Integer, String> entry : hashList.entrySet()) {

            int key = entry.getKey();
            String value = entry.getValue();
            
            System.out.println("Key: " + key + ", Value: " + value);
        }
    }    
}
/*
Output: 

Key: 1, Value: Apple
Key: 2, Value: Banana
Key: 3, Value: Orange
Key: 4, Value: Grapes
Key: 5, Value: Mango

*/
