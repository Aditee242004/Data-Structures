import java.util.Scanner;

public class WorstCase{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input age
        System.out.print("Enter your age: ");
        int age = 12;

        // Worst case: the user is not eligible to vote
        if (age >= 18) {
            System.out.println("You are eligible to vote.");
        } else {
            System.out.println("You are not eligible to vote.");
            System.out.println("You need to be at least 18 years old to vote.");
        }

        scanner.close();
    }
}