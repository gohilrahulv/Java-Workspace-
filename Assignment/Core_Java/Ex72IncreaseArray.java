
import java.util.ArrayList;

public class Ex72IncreaseArray 
{
    public static void main(String[] args) 
    {
    
        ArrayList<String> lan= new ArrayList<String>(3);
		lan.add("C++");
		lan.add("Java");
		lan.add("HTML");
		System.out.println("Original Array List : " + lan);
		lan.ensureCapacity(7);
		lan.add("C");    
		lan.add("Php");
		lan.add("Css");
		lan.add("MySQL");
		System.out.println("New Increased Array List : " + lan);

    }    
}
