abstract class shape
{
    public abstract double rectangleArea(double length,double breath);
    public abstract double squareArea(double side);
    public abstract double circleArea(double radius);

}
class Area extends shape
{

    @Override
    public double rectangleArea(double length, double breath) 
    {
       return length*breath;
    }

    @Override
    public double squareArea(double side) 
    {
        return side*side;
    }

    @Override
    public double circleArea(double radius) 
    {
        return (22*radius)/7;
    }
    
}

public class Ex33Area 
{
    public static void main(String args[])
    {
        Area area = new Area();

        double rectangleArea = area.rectangleArea(10, 20);
        System.out.println("Area Of Rectangle : "+rectangleArea);
        double squareArea = area.squareArea(10);
        System.out.println("Area Of Squar : "+squareArea);
        double circleArea = area.circleArea(7);
        System.out.println("Area Of Circle : " + circleArea);
    }
}
