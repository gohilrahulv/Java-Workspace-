public class Ex39TryCatch 
{
    public static void main (String args[])
    {
        
        try 
        {
            int a [] = new int[5];
            a[6] = 30/0;
            
            System.out.println(a[6]);
            try 
            {
                
                System.out.println(a[6]);
            } 
            catch (ArrayIndexOutOfBoundsException e) 
            {
             e.printStackTrace();
            }
        }
        catch (ArithmeticException e) 
        {
            e.printStackTrace();
        }
        System.out.println("Done!!");
    }
}