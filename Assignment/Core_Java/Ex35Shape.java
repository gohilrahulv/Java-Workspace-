class Shape {
    public void printShape() {
        System.out.println("This is a shape.");
    }
}

class Rectangle extends Shape {
    public void printRectangle() {
        System.out.println("This is a rectangular shape.");
    }
}

class Circle extends Shape {
    public void printCircle() {
        System.out.println("This is a circular shape.");
    }
}

class Square extends Rectangle {
    public void printSquare() {
        System.out.println("Square is a rectangle.");
    }
}

public class Ex35Shape {
    public static void main(String[] args) {
        Square square = new Square();

        square.printShape();     // Call method from 'Shape' class
        square.printRectangle(); // Call method from 'Rectangle' class (inherited)
        square.printSquare();    // Call method from 'Square' class
    }
}
