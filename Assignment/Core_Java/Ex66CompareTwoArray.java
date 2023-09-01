import java.util.ArrayList;

public class Ex66CompareTwoArray 
{
    public static void main(String[] args) 
    {
        
         
        ArrayList<String> color = new ArrayList<>();

        color.add("Red");
        color.add("Blue");
        color.add("Yellow");
        color.add("Orange");
       
        ArrayList<String> color1 = new ArrayList<>();

        color1.add("Red");
        color1.add("Blue");
        color1.add("Yellow");
        color1.add("Orange");
       
        boolean isEqual = color1.equals(color);

        if(isEqual)
        {
            System.out.println("Both Array Are Same.");
        }
        else
        {
            System.out.println("Array Are Different>");
        }
    }    
}
