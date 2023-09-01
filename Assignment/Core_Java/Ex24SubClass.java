class parent
    {
        public void parentmethod()
        {
            System.out.println("This Is Parent Class.");
        }
    }
class child extends parent
    {
        public void childmethod()
        {
            System.out.println("This Is Child Class.");
        }
    }


public class Ex24SubClass 
{
    public static void main(String args[])
    {
        parent parentobj= new parent();
        child childobj = new child();

        parentobj.parentmethod();
        childobj.childmethod();
        childobj.parentmethod();
    }
    
}
