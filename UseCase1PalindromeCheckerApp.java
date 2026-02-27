// UseCase11PalindromeCheckerApp.java

import java.util.Scanner;
import java.util.Stack;

// Service Class (Encapsulates Palindrome Logic)
class PalindromeChecker {

    // Public method exposed to outside world
    public boolean checkPalindrome(String input) {

        if (input == null) {
            return false;
        }

        // Normalize string (optional improvement)
        String processed = input.toLowerCase().replaceAll("[^a-z0-9]", "");

        Stack<Character> stack = new Stack<>();

        // Push all characters into stack
        for (int i = 0; i < processed.length(); i++) {
            stack.push(processed.charAt(i));
        }

        // Compare characters by popping from stack
        for (int i = 0; i < processed.length(); i++) {
            if (processed.charAt(i) != stack.pop()) {
                return false;
            }
        }

        return true;
    }
}

// Main Application Class
public class UseCase11PalindromeCheckerApp {

    static final String APP_VERSION = "1.0";

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("======================================");
        System.out.println(" OBJECT-ORIENTED PALINDROME CHECKER   ");
        System.out.println("======================================");
        System.out.println("Application Name : Palindrome Checker App");
        System.out.println("Application Version : " + APP_VERSION);
        System.out.println("======================================");

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Create Service Object
        PalindromeChecker checker = new PalindromeChecker();

        // Call Encapsulated Method
        boolean result = checker.checkPalindrome(input);

        if (result) {
            System.out.println("Result: The string is a PALINDROME.");
        } else {
            System.out.println("Result: The string is NOT a palindrome.");
        }

        scanner.close();
    }
}
