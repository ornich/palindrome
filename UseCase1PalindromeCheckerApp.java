// UseCase5PalindromeCheckerApp.java

import java.util.Scanner;
import java.util.Stack;

public class UseCase5PalindromeCheckerApp {

    static final String APP_VERSION = "1.0";

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("======================================");
        System.out.println("      STACK BASED PALINDROME CHECK    ");
        System.out.println("======================================");
        System.out.println("Application Name : Palindrome Checker App");
        System.out.println("Application Version : " + APP_VERSION);
        System.out.println("======================================");

        // Take user input
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Create Stack
        Stack<Character> stack = new Stack<>();

        // Push characters into stack
        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }

        boolean isPalindrome = true;

        // Pop characters and compare
        for (int i = 0; i < input.length(); i++) {

            char poppedChar = stack.pop();

            if (input.charAt(i) != poppedChar) {
                isPalindrome = false;
                break;
            }
        }

        // Print result
        if (isPalindrome) {
            System.out.println("Result: The string is a PALINDROME.");
        } else {
            System.out.println("Result: The string is NOT a palindrome.");
        }

        System.out.println("======================================");
        System.out.println("Program Ended Successfully.");

        scanner.close();
    }
}
