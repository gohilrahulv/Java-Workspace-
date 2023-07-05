import java.util.Scanner;


public class Ex23 
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        System.out.println("\n => Find out the Area of: "); 
        System.out.println("\n 1. Triangle \n 2. Rectangle \n 3. Circle"); 

        System.out.println("Enter Any One.");
        int area = s.nextInt();


        System.out.println("-----------------------------------------");

        switch(area)
        {
            case 1:
            float base,height,areaOfTriangle;

            System.out.print(" Enter Base : ");
            base = s.nextFloat(); 

            System.out.print(" Enter Height : ");    
            height = s.nextFloat();     

            areaOfTriangle = (base * height) / 2;     

            System.out.print(" Area of Triangle is : " + areaOfTriangle);    

            break;  
            case 2:
            float length,breath,areaOfRectangle;
            
            System.out.print(" Enter length : ");
            length = s.nextFloat(); 

            System.out.print(" Enter breath : ");
            breath = s.nextFloat(); 

            areaOfRectangle = length*breath;

            System.out.println("Area of Triangle is : "+ areaOfRectangle);
            break;

            case 3:
            float pie = 22/7,araeofcircul;

            System.out.println("Eneter The radius : ");
            int radius = s.nextInt();

            araeofcircul = pie*radius*radius;

            System.out.println("Area Of Circul : "+araeofcircul);
            break;

            default: 
            System.out.println("\n INVALID VALUE...");
            break; 
        }
        s.close();
    }
}
