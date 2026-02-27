// UseCase9RecursivePalindromeCheckerApp.java

import java.util.Scanner;

public class UseCase9RecursivePalindromeCheckerApp {

    static final String APP_VERSION = "1.0";

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Welcome Message
        System.out.println("======================================");
        System.out.println("   RECURSIVE PALINDROME CHECKER APP   ");
        System.out.println("======================================");
        System.out.println("Application Name : Palindrome Checker App");
        System.out.println("Application Version : " + APP_VERSION);
        System.out.println("======================================");

        // Input
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Check palindrome using recursion
        boolean result = isPalindrome(input, 0, input.length() - 1);

        if (result) {
            System.out.println("Result: The string is a PALINDROME.");
        } else {
            System.out.println("Result: The string is NOT a palindrome.");
        }

        scanner.close();
    }

    // Recursive Method
    public static boolean isPalindrome(String str, int start, int end) {

        // Base Condition 1: If start crosses end → palindrome
        if (start >= end) {
            return true;
        }

        // If characters don't match → not palindrome
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }

        // Recursive Call
        return isPalindrome(str, start + 1, end - 1);
    }
}
