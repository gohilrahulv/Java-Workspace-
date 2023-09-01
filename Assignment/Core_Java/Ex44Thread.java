public class Ex44Thread
{
    public static void main(String[] args) 
    {
        myrunnable mr = new myrunnable();

        Thread t= new Thread(mr);
        
        t.start();
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
    }

}

