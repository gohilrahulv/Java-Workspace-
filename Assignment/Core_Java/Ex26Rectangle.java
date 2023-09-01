 class Rectangle {

    private double length;
    private double breadth;

    public Rectangle(double length, double breadth) {

        this.length = length;
        this.breadth = breadth;
    }

    public double getArea() {

        return length * breadth;
    }

    public double getPerimeter() {
        
        return 2 * (length + breadth);
    }
}

class Square extends Rectangle {

    public Square(double side) {
        
        super(side, side);
    }
}

public class Ex26Rectangle {

    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(5.0, 3.0);

        System.out.println("Rectangle Area: " + rectangle.getArea());
        System.out.println("Rectangle Perimeter: " + rectangle.getPerimeter());


        Square square = new Square(4.0);

        System.out.println("Square Area: " + square.getArea());
        System.out.println("Square Perimeter: " + square.getPerimeter());
    }
}
