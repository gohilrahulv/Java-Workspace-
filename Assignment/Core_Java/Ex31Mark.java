abstract class Mark
{
    abstract double getPercentage();
}

class A extends Mark
{
    private double subject1,subject2,subject3;

    public A(double subject1,double subject2,double subject3)
    {
        this.subject1 = subject1;
        this.subject2 = subject2;
        this.subject3 = subject3;
    }

    @Override
    double getPercentage() 
    {
        return (subject1+subject2+subject3)/3;
    }
    
}
class B extends Mark
{
    private double subject1,subject2,subject3,subject4;

    public B (double subject1,double subject2,double subject3,double subject4)
    {
        this.subject1 = subject1;
        this.subject2 = subject2;
        this.subject3 = subject3;
        this.subject4 = subject4;
    }

    @Override
    double getPercentage() 
    {
        return (subject1+subject2+subject3+subject4)/4;
    }
    
}

public class Ex31Mark 
{
    public static void main(String args[])
    {
        A a = new A(10, 20, 30);
        B b = new B(15, 25, 35, 45);

        System.out.println("Percentage of A : "+a.getPercentage()+"%");
        System.out.println("Percentage of B : "+b.getPercentage()+"%");
        
    }
}
