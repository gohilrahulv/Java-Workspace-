import java.util.ArrayList;
import java.util.Scanner;

public class Ex53ArrayList 
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);

        ArrayList<String> color = new ArrayList<>();
    
        color.add("Red");
        color.add("Blue");
        color.add("Yellow");
        color.add("Orange");


        System.out.println("Original ArrayList: " + color); 

        System.out.println("Enter indexToUpdate : ");
        int indexToUpdate = s.nextInt();
        System.out.println("Enter Update Color : ");
        String update = s.next();

        if (indexToUpdate>=0 && indexToUpdate<=color.size())
        {
           color.set(indexToUpdate, update);
           System.out.println("Element at index " + indexToUpdate + " updated to: " + update);
        }
        else
        {
            System.out.println("Invalide Index Input!");
        }
        s.close();
        System.out.println("Updated ArrayList : " +color);
    }
   
}
