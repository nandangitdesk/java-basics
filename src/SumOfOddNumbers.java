public class SumOfOddNumbers {

    // Function to calculate the sum of all odd numbers from 1 to n
    public static int sumOfOddNumbers(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i += 2) { // Increment by 2 to check only odd numbers
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        // Calculating and printing the sum of odd numbers
        int result = sumOfOddNumbers(n);
        System.out.println("The sum of all odd numbers from 1 to " + n + " is: " + result);

        scanner.close();
    }
}
