import java.util.ArrayList;
import java.util.Collections;

public class Ex67SwapElement 
{
        public static void main(String[] args) {
            // Create an ArrayList
            ArrayList<Integer> numbers = new ArrayList<>();
            numbers.add(10);
            numbers.add(20);
            numbers.add(30);
            numbers.add(40);
            numbers.add(50);
    
            // Display the original ArrayList
            System.out.println("Original ArrayList: " + numbers);
    
            // Swap elements at positions 1 and 3
            int index1 = 1;
            int index2 = 3;
            Collections.swap(numbers, index1, index2);
    
            // Display the ArrayList after swapping
            System.out.println("ArrayList after swapping: " + numbers);
        
    
       
            
        
    }
    
       
}
