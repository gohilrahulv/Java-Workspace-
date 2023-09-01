import java.util.ArrayList;

public class Ex73ReplaceElement 
{
    public static void main(String[] args) 
    {
        ArrayList<String> color = new ArrayList<>();

        color.add("Red");
        color.add("Blue");
        color.add("Yellow");
        color.add("Orange");
        System.out.println("Color List : "+color);

        color.set(1, "Black");
        System.out.println("Replce Element List : "+color);
    }    
}
