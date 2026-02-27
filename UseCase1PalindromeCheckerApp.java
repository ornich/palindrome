// UseCase3PalindromeCheckerApp.java

import java.util.Scanner;

public class UseCase3PalindromeCheckerApp {

    static final String APP_VERSION = "1.0";

    // Main Method - Entry Point
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("======================================");
        System.out.println("     PALINDROME CHECK USING REVERSE   ");
        System.out.println("======================================");
        System.out.println("Application Name : Palindrome Checker App");
        System.out.println("Application Version : " + APP_VERSION);
        System.out.println("======================================");

        // Take user input
        System.out.print("Enter a string: ");
        String original = scanner.nextLine();

        // Reverse string using for loop
        String reversed = "";

        for (int i = original.length() - 1; i >= 0; i--) {
            reversed = reversed + original.charAt(i);
        }

        System.out.println("Reversed String: " + reversed);

        // Compare original and reversed
        if (original.equals(reversed)) {
            System.out.println("Result: The string is a PALINDROME.");
        } else {
            System.out.println("Result: The string is NOT a palindrome.");
        }

        System.out.println("======================================");
        System.out.println("Program Ended Successfully.");

        scanner.close();
    }
}
