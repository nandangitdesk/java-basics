public class PowerCalculator {

    // Method to calculate x raised to the power of n
    public static double power(int x, int n) {
        return Math.pow(x, n);
    }

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter the base (x): ");
        int x = scanner.nextInt();

        System.out.print("Enter the exponent (n): ");
        int n = scanner.nextInt();

        // Calculating and displaying the result
        double result = power(x, n);
        System.out.println(x + " raised to the power of " + n + " is: " + result);

        scanner.close();
    }
}
