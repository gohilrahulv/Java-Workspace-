import java.util.ArrayList;
import java.util.Scanner;

public class Ex52ArrayList 
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);

        ArrayList<String> color = new ArrayList<>();
    
        color.add("Red");
        color.add("Blue");
        color.add("Yellow");
        color.add("Orange");

        System.out.println("Enter IndexToRetrieve : ");
        int indexToRetrieve = s.nextInt();

        if (indexToRetrieve>=0 && indexToRetrieve<=color.size())
        {
            String retrievedElement = color.get(indexToRetrieve);
            System.out.println("Element at index " + indexToRetrieve + ": " + retrievedElement);
        }
        else
        {
            System.out.println("Invalide Index Input!");
        }
        s.close();
    }
   
}
