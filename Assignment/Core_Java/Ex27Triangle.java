public class Ex27Triangle 
{
    double s1;
    double s2;
    double s3;

    public Ex27Triangle()
    {
        s1=3;
        s2=4;
        s3=5;

    }
    public double calculatePerimeter()
        {
            double Perimeter = s1+s2+s3;
            return Perimeter;
        }
        

    public double calculateArea() 
    {
        double s = (s1+s2+s3)/2;
        double Area = Math.sqrt(s * (s - s1) * (s - s2) * (s - s3));
        return Area;
    }

    public static void main(String args[])
    {
        Ex27Triangle triangle = new Ex27Triangle();
        double Area = triangle.calculateArea();
        double Perimeter = triangle.calculatePerimeter();

        System.out.println("Area Of Triangle : "+Area);
        System.out.println("Perimeter Of Triangle : "+Perimeter);
    }
        
    
}
