import java.util.HashSet;

public class Ex61HashSet 
{
    public static void main(String[] args) 
    {
        HashSet<String> color = new HashSet<>();
        
        color.add("Red");
        color.add("Blue");
        color.add("Yellow");
        color.add("Orange");

        int size  = color.size();

        System.out.println("Size Of The HashSet Is : "+size);
    }    
}
