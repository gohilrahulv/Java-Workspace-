public class Ex30Bank 
{

    public static void main(String args[])
    {

        BankA banka = new BankA();
        BankB bankb = new BankB();
        BankC bankc = new BankC();
        
        System.out.println("Balance in Bank A: "+banka.getBalance());
        System.out.println("Balance in Bank B: "+bankb.getBalance());
        System.out.println("Balance in Bank C: "+bankc.getBalance());

    }

}
abstract class Bank
{
    abstract int getBalance();
}
class BankA extends Bank
{
    private int balance = 100;

    @Override
    int getBalance() 
    {
       return balance;
    }

}
class BankB extends Bank
{
    private int balance = 200; 
    @Override
    int getBalance() 
    {
        
        return balance;
    }

    

}
class BankC extends Bank
{
    private int balance = 500; 
    @Override
    int getBalance() 
    {
        
        return balance;
    }

    

}
