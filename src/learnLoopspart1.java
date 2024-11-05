import java.util.Scanner;

public class learnLoopspart1{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter the value of n
        System.out.print("Enter a number (n): ");
        int n = scanner.nextInt();

        System.out.println("Even numbers from 1 to " + n + ":");

        // Use a loop to print even numbers up to n
        for (int i = 2; i <= n; i += 2) {
            System.out.print(i + " ");
        }

        scanner.close();
    }
}

