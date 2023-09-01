
import java.util.Scanner;

class Complex 
{

    private double real;
    private double imaginary;

    public Complex(double real, double imaginary) 
    {

        this.real = real;
        this.imaginary = imaginary;
    }

    public Complex add(Complex other) 
    {

        double sumReal = this.real + other.real;
        double sumImaginary = this.imaginary + other.imaginary;
        return new Complex(sumReal, sumImaginary);
    }

    public Complex subtract(Complex other) 
    {

        double diffReal = this.real - other.real;
        double diffImaginary = this.imaginary - other.imaginary;
        return new Complex(diffReal, diffImaginary);
    }

    public Complex multiply(Complex other) 
    {

        double productReal = this.real * other.real - this.imaginary * other.imaginary;
        double productImaginary = this.real * other.imaginary + this.imaginary * other.real;
        return new Complex(productReal, productImaginary);
    }

    public String toString() 
    {

        return real + " + " + imaginary + "i";
    }
}

public class Ex28Complex  
{

    public static void main(String[] args) 
    {

        Scanner sc = new Scanner(System.in);

        // input for the first complex number
        System.out.println("Enter the real part of the first complex number: ");
        double real1 = sc.nextDouble();

        System.out.println("Enter the imaginary part of the first complex number: ");
        double imaginary1 = sc.nextDouble();

        // input for the second complex number
        System.out.println("Enter the real part of the second complex number: ");
        double real2 = sc.nextDouble();

        System.out.println("Enter the imaginary part of the second complex number: ");
        double imaginary2 = sc.nextDouble();

        Complex complex1 = new Complex(real1, imaginary1);
        Complex complex2 = new Complex(real2, imaginary2);

        // perform operations and print results
        Complex sum = complex1.add(complex2);
        Complex difference = complex1.subtract(complex2);
        Complex product = complex1.multiply(complex2);

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        sc.close();
    }
}