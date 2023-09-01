import java.util.HashSet;
import java.util.Set;

public class Ex75CompareTwoSet 
{
    public static void main(String[] args) 
    {
        Set<String> color1 = new HashSet<>();
            color1.add("Black");
            color1.add("Yellow");
            color1.add("Green");
            color1.add("Orange");

        Set<String> color = new HashSet<>();
            color.add("Red");
            color.add("Blue");
            color.add("Yellow");
            color.add("Orange");

            System.out.println("Set 1st : "+color1);
            System.out.println("Set 2nd : + "+color);

            color1.retainAll(color);

            System.out.println("Elements retained in both sets: " + color1);

    }    
}
