public class Ex21Datatype 
{
    
    public void print(int num)
    {
        System.out.println("Int :"+num);
    }

    public void print(double num)
    {
        System.out.println("Double :"+num);
    }
    public void print(float num)
    {
        System.out.println("Float : "+num);
    }
    public void print(String num)
    {
        System.out.println("String : "+num);
    }
    public void print(boolean num)
    {
        System.out.println("Boolean : "+num);
    }
    public void print(int [] num)
    {
        System.out.println("Int Array : ");
        for(int i :num)
        {
            System.out.println(i+" ");
        }
        
    }

    //=============================================

    public static void main(String args[])
    {
        Ex21Datatype printer = new Ex21Datatype();
        printer.print(42);                 
        printer.print(3.14f);              
        printer.print("Hello");            
        printer.print(true);               
        printer.print(new int[]{1, 2, 3}); 
        printer.print(-12.12);
    }

}
