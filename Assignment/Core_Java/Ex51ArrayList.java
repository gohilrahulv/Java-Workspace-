import java.util.ArrayList;

public class Ex51ArrayList 
{
    public static void main(String[] args) 
    {
        ArrayList<String> name = new ArrayList<>();
        name.add("Rahul");
        name.add("Ronak");
        name.add("Jenish");
        name.add("Sudhir");

        System.out.println("Old List : "+name);
        name.add(0, "Rohit");
        System.out.println("New List : " +name);
    }    
}
