import java.util.Scanner;

public class MarksEvaluator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.print("Enter 1 to input marks or 0 to stop: ");
            choice = scanner.nextInt();

            if (choice == 1) {
                System.out.print("Enter student's marks (out of 100): ");
                int marks = scanner.nextInt();

                if (marks >= 90 && marks <= 100) {
                    System.out.println("This is Good");
                } else if (marks >= 60 && marks <= 89) {
                    System.out.println("This is also Good");
                } else if (marks >= 0 && marks <= 59) {
                    System.out.println("This is Good as well");
                } else {
                    System.out.println("Invalid marks entered. Please enter a value between 0 and 100.");
                }
            } else if (choice != 0) {
                System.out.println("Invalid choice. Please enter 1 or 0.");
            }

        } while (choice != 0);

        System.out.println("Program stopped.");
        scanner.close();
    }
}
