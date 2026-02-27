// UseCase10NormalizedPalindromeCheckerApp.java

import java.util.Scanner;

public class UseCase10NormalizedPalindromeCheckerApp {

    static final String APP_VERSION = "1.0";

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("======================================");
        System.out.println(" CASE-INSENSITIVE PALINDROME CHECKER  ");
        System.out.println("======================================");
        System.out.println("Application Name : Palindrome Checker App");
        System.out.println("Application Version : " + APP_VERSION);
        System.out.println("======================================");

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Step 1: Normalize String
        String normalized = normalizeString(input);

        // Step 2: Apply Palindrome Logic
        boolean result = isPalindrome(normalized);

        if (result) {
            System.out.println("Result: The string is a PALINDROME.");
        } else {
            System.out.println("Result: The string is NOT a palindrome.");
        }

        scanner.close();
    }

    // String Preprocessing (Normalization)
    public static String normalizeString(String str) {

        // Convert to lowercase
        str = str.toLowerCase();

        // Remove spaces and special characters using regex
        str = str.replaceAll("[^a-z0-9]", "");

        return str;
    }

    // Simple Two-Pointer Palindrome Logic
    public static boolean isPalindrome(String str) {

        int start = 0;
        int end = str.length() - 1;

        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }
}
