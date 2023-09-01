public class Ex46Thread
{
    public static void main(String[] args) 
    {
        myrunnable mr = new myrunnable();
        myrunnable mr1 = new myrunnable();

        Thread t1= new Thread(mr);
        Thread t2= new Thread(mr1);
        
        t1.start();
        t2.start();
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
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}

