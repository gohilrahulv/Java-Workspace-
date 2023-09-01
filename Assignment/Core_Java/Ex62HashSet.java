import java.util.HashMap;

public class Ex62HashSet 
{
    public static void main(String[] args) 
    {
        HashMap<String,Integer> color = new HashMap<>();
        
        color.put("Red",4);
        color.put("Blue",2);
        color.put("Yellow",6);
        color.put("Orange",0);

        System.out.println("HashMap : "+color);
        //HashMap : {Red=4, Blue=2, Yellow=6, Orange=0}
    }    
}