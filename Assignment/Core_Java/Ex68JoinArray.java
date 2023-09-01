import java.util.ArrayList;

public class Ex68JoinArray 
{
    
    public static void main(String[] args) 
    {
        
        ArrayList<String> color1 = new ArrayList<>();
            color1.add("Black");
            color1.add("White");
            color1.add("Green");
            color1.add("Violet");
            

        ArrayList<String> color = new ArrayList<>();

            color.add("Red");
            color.add("Blue");
            color.add("Yellow");
            color.add("Orange");

        ArrayList<String> joinlist = new ArrayList<>();
            
            joinlist.addAll(color1);
            joinlist.addAll(color);

            System.out.println("Join ArrayList : "+ joinlist);
    }

}
