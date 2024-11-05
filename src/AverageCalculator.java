import java.util.Scanner;

public class AverageCalculator {

    // Function to calculate the average of three numbers
    public static double calculateAverage(int num1, int num2, int num3) {
        return (num1 + num2 + num3) / 3.0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter the first number: ");
        int number1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int number2 = scanner.nextInt();

        System.out.print("Enter the third number: ");
        int number3 = scanner.nextInt();

        // Calculating the average
        double average = calculateAverage(number1, number2, number3);

        // Printing the average
        System.out.println("The average of the three numbers is: " + average);

        scanner.close();
    }
}
