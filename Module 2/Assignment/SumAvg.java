import java.util.Scanner;

public class SumAvg {

    public static void main(String[] args) {

        // Create a Scanner object to read input from the keyboard
        Scanner scanner = new Scanner(System.in);

        // Declare variables to store the sum and average
        int sum = 0;
        double avg = 0;

        // Prompt the user to enter 5 numbers
        System.out.println("Enter 5 numbers: ");

        // Read 5 numbers from the user
        for (int i = 0; i < 5; i++) {
            int num = scanner.nextInt();
            sum += num;
        }

        // Calculate the average
        avg = sum / 5;

        // Display the sum and average
        System.out.println("The sum of the numbers is " + sum);
        System.out.println("The average of the numbers is " + avg);
    }
}
