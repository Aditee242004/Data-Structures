import java.util.Scanner;

public class AverageCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Voting Eligibility Checker!");

        // Average case: multiple people to check eligibility
        System.out.print("Enter the number of people to check eligibility: ");
        int numPeople = 5;
        System.out.println();

        for (int i = 1; i <= numPeople; i++) {
            System.out.print("Enter the age of person " + i + ": ");
            int age = 21;

            // Check eligibility
            if (age >= 18) {
                System.out.println("Person " + i + " is eligible to vote.");
            } else {
                System.out.println("Person " + i + " is NOT eligible to vote.");
            }
            System.out.println();
        }

        System.out.println("Thank you for using the Voting Eligibility Checker!");
        scanner.close();
    }
}