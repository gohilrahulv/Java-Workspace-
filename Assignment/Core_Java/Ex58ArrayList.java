import java.util.ArrayList;
import java.util.Collections;

public class Ex58ArrayList 
{
    public static void main(String[] args) 
    {
        ArrayList<Integer> num = new ArrayList<>();
        
        for(int i = 1;i<=5;i++)
        {
            num.add(i);
        }

        System.out.println("Original ArrayList: " + num);

        Collections.shuffle(num);

        System.out.println("Shuffled ArrayList: " + num);
    }    
}
