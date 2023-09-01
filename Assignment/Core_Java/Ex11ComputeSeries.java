import java.util.Scanner;

public class Ex11ComputeSeries {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Input number: ");
        int n = s.nextInt();

        int sum = 0;
        int temp = n;

        for (int i = 1; i <= 3; i++) {
            sum += temp;
            temp = temp * 10 + n;
        }

        System.out.println("Result: " + sum);

        s.close();
    }
}
