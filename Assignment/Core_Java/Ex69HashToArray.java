import java.util.HashSet;

public class Ex69HashToArray 
{
    
    public static void main(String[] args) 
    {
    
        HashSet<Integer> hashset = new HashSet<>();

        hashset.add(10);
        hashset.add(20);
        hashset.add(30);
        hashset.add(40);
        hashset.add(50);

        Integer [] array = hashset.toArray(new Integer[0]);

        System.out.println("Array Elemnet : ");
        for (Integer element : array)
        {
            System.out.println(element);
        }
    }

}
/*
Array Elemnet : 
50
20
40
10
30
*/
