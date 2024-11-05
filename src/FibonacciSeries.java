import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number of terms
        System.out.print("Enter the number of terms in the Fibonacci series: ");
        int n = scanner.nextInt();

        // Initialize the first two terms
        int firstTerm = 0;
        int secondTerm = 1;

        System.out.print("Fibonacci Series: ");

        // Print the Fibonacci series
        for (int i = 1; i <= n; i++) {
            System.out.print(firstTerm + " "); // Print the current term

            // Calculate the next term
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;  // Update the first term
            secondTerm = nextTerm;    // Update the second term
        }

        scanner.close(); // Close the scanner
    }
}
