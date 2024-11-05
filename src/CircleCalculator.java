public class CircleCalculator {

    // Method to calculate the circumference of a circle given the radius
    public static double calculateCircumference(double radius) {
        double circumference = 2 * Math.PI * radius;
        return circumference;
    }

    public static void main(String[] args) {
        // Example usage
        double radius = 5.0; // You can change this value or take input from the user
        double result = calculateCircumference(radius);
        System.out.println("The circumference of a circle with radius " + radius + " is: " + result);
    }
}
