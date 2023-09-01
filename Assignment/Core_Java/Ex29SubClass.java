abstract class Parent
{
    public abstract void message();
}
class Sub1 extends Parent
{
    @Override
    public void message() 
    {
        System.out.println("This Is First SubClass...");    
    }
}
class Sub2 extends Parent
{
    @Override
    public void message() 
    {
        System.out.println("This Is Second SubClass...");
    }
}
public class Ex29SubClass 
{
    public static void main(String args[])
    {
        Parent first = new Sub1();
        Parent second = new Sub2();

        first.message();
        second.message();
    }
}
