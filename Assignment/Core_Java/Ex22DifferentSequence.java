public class Ex22DifferentSequence 
{

    public void print(int num,char c)
    {
        System.out.println("Int : "+num+" Char : "+c);
    }
    public void print(char c,int num)
    {
        System.out.println("Char : "+c+" Int : "+num );
    }

    public static void main(String args[])
    {
        Ex22DifferentSequence printer= new Ex22DifferentSequence();
        printer.print(1, 'A');
        printer.print('B', 2);

    }
}
