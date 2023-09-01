import java.util.ArrayList;




public class Ex57ArrayList 
{
    public static void main(String[] args) 
    {
        ArrayList<Integer> num = new ArrayList<>();
        
        num.add(1);
        num.add(2);
        num.add(3);
        num.add(4); 

        System.out.println("Original Array List : "+num);

        ArrayList<Integer> num1 = new ArrayList<>(num);

        System.out.println("Source ArrayList: " + num);
        System.out.println("Target ArrayList: " + num1);
    }    
}
