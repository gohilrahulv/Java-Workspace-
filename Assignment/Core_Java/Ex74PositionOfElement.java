import java.util.ArrayList;

public class Ex74PositionOfElement 
{
    public static void main(String[] args) 
    {
        ArrayList<String> color = new ArrayList<>();

        color.add("Red");
        color.add("Blue");
        color.add("Yellow");
        color.add("Orange");
        System.out.println("Elements of the ArrayList with their positions:");
        for(int i=0;i<color.size();i++)
        {
            System.out.println("Element At "+i+" Is "+color.get(i)+".");
        }

        
    }    
}
