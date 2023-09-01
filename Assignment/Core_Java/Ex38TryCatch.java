
public class Ex38TryCatch 
{
    
    public static void main(String args[])
    {
        int a [] = new int [5];
        try 
        {
            a[6] = 30/0;
            
            System.out.println(a[6]);
        } 
        catch(ArithmeticException e)
        {
            e.printStackTrace();
        }
        catch (ArrayIndexOutOfBoundsException e) 
        {
           e.printStackTrace();
        }
        System.out.println("Done!!");
    }
}
