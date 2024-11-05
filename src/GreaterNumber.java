public class GreaterNumber {

    // Method to return the greater of two numbers
    public static int findGreater(int num1, int num2) {
        if (num1 > num2) {
            return num1;
        } else {
            return num2;
        }
    }

    public static void main(String[] args) {
        // Example usage
        int a = 10;
        int b = 20;

        int greater = findGreater(a, b);
        System.out.println("The greater number between " + a + " and " + b + " is: " + greater);
    }
}
