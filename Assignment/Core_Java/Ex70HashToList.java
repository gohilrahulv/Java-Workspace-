import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Ex70HashToList 
{
    
    public static void main(String[] args) 
    {
    
        HashSet<Integer> hashset = new HashSet<>();

        hashset.add(10);
        hashset.add(20);
        hashset.add(30);
        hashset.add(40);
        hashset.add(50);

        ArrayList<Integer> arraylist = new ArrayList<>(hashset);

        System.out.println("ArrayList Elemnet : ");
        for (Integer element : arraylist)
        {
            System.out.println(element);
        }

        List<Integer> list = new ArrayList<>(hashset);

        System.out.println("\nList Element : ");
        for (Integer element1 : list)
        {
            System.out.println(element1);
        }
    }

}
/*
ArrayList Elemnet : 
50
20
40
10
30

List Element :
50
20
40
10
30
 */