import java.util.HashSet;

public class Ex59HashSet 
{
    
    public static void main(String[] args) 
    {
        HashSet<String> colorset = new HashSet<>();

        colorset.add("Red");
        colorset.add("Blue");
        colorset.add("Yellow");
        
        System.out.println("Original HashSet: " + colorset);

        String newcolor = "Orange";
        colorset.add(newcolor);

        System.out.println("Updated HashSet: " + colorset);
    }

}
