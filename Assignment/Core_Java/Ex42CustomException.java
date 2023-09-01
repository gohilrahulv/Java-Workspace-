import java.util.Scanner;

class InsufficientBalanceException extends Exception {

    private double requiredAmount;

    public InsufficientBalanceException(double requiredAmount) 
    {

        this.requiredAmount = requiredAmount;
    }

    public double getRequiredAmount() 
    {

        return requiredAmount;
    }
}

class Account 
{

    private double balance;

    public Account(double initialBalance) 
    {

        balance = initialBalance;
    }

    public void withdraw(double amount) throws InsufficientBalanceException 
    {

        if (amount > balance) 
        {

            throw new InsufficientBalanceException(amount - balance);
        
        } 
        else 
        {

            balance -= amount;
            System.out.println("Amount withdrawn: " + amount);
        }
    }

    public double getBalance() 
    {

        return balance;
    }
}


public class Ex42CustomException 
{
    
    public static void main(String[] args) 
    {

        double initialBalance = 2000;
        Account account = new Account(initialBalance);

        System.out.println("Account balance is: " + account.getBalance());
        System.out.println("Enter The Amount Foe  : ");
        Scanner s = new Scanner(System.in);
        double withdrawAmount = s.nextDouble();

        try 
        {

            account.withdraw(withdrawAmount);
        } 
        catch (InsufficientBalanceException e) 
        {
            
            double requiredAmount = e.getRequiredAmount();
            System.out.println("Sorry, insufficient balance, you need more " + requiredAmount + " Rs. to perform this transaction.");
        }

        System.out.println("Updated account balance is: " + account.getBalance());
        s.close();
    }

}
