public class Ex36TryCatch 
{
    
    public static void main(String[] args) 
    {  

        try 
        {  

            int data=50/0;  
            System.out.println(data);

        } catch(ArithmeticException e) 
        {  

            System.out.println(e);  
        }  
        
        System.out.println("rest of the code");  
    }  

}
