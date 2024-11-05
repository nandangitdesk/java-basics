public class GCDCalculator {

    // Method to calculate the GCD of two numbers
    public static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;  // Calculate the remainder of a divided by b
            a = temp;   // Assign b to a
        }
        return a; // When b is 0, a is the GCD
    }

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        // Calculating and displaying the GCD
        int gcd = findGCD(num1, num2);
        System.out.println("The GCD of " + num1 + " and " + num2 + " is: " + gcd);

        scanner.close();
    }
}
