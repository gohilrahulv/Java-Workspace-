public class Ex23Area 
{
    public void area(int a)
    {
        int c = a*a;
        System.out.println("Area of Square : "+c);
    }
    public void area(int x,int y)
    {
        int z = (x*y);
        System.out.println("Area of Rectangle : "+z);
    }

    public static void main(String args[])
    {
        Ex23Area printarea = new Ex23Area();
        printarea.area(2, 7);
        printarea.area(22);

    }
}
