public class VotingEligibility {

    // Method to check if a person is eligible to vote
    public static boolean isEligibleToVote(int age) {
        return age >= 18;
    }

    public static void main(String[] args) {
        // Example usage
        int age = 20; // You can change this value or take input from the user

        if (isEligibleToVote(age)) {
            System.out.println("The person is eligible to vote.");
        } else {
            System.out.println("The person is not eligible to vote.");
        }
    }
}
