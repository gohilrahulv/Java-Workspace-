public class Ex47Thread
{
    public static void main(String[] args) 
    {
        myrunnable mr = new myrunnable();
       
        Thread t= new Thread(mr);

        t.start();
       
        Thread t1 = new Thread(mr);

        t1.start();
    }   
}
class myrunnable implements Runnable
{

    @Override
    public void run() 
    {
        for (int i=0;i<=5;i++)
        {
             System.out.println("Thread: " + Thread.currentThread().getId() + ", Count: " + i);
        }
        try 
        {
            Thread.sleep(1000);
        } 
        catch (InterruptedException e) 
        {
           
            e.printStackTrace();
        }
    }

}

