import java.util.ArrayList;
import java.util.Iterator;

public class Ex50ArrayList 
{
    public static void main(String[] args) 
    {
        
        ArrayList<Integer> number = new ArrayList<>();

        number.add(0);
        number.add(1);
        number.add(2);
        number.add(3);
        number.add(4);
        number.add(5);


        System.out.println(number);
        // Using enhanced for loop (for-each loop)
        System.out.println("----------------------------");
        System.out.println("Using enhanced for loop:");
        System.out.println("----------------------------");
        for (int num : number) 
        {
            System.out.println(num);
        }
        System.out.println("------------------------------------------");

         // Using traditional for loop with index
         System.out.println("Using traditional for loop with index:");
         System.out.println("------------------------------------------");
         for (int i = 0; i < number.size(); i++) {
             System.out.println(number.get(i));
         }
         System.out.println("----------------------------");
 
         // Using Iterator
         System.out.println("Using Iterator:");
         System.out.println("----------------------------");
         Iterator<Integer> iterator = number.iterator();
         while (iterator.hasNext()) {
             System.out.println(iterator.next());
         }
    }
    
}
