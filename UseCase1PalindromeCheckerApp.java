// UseCase13PalindromeCheckerApp.java

import java.util.*;

public class UseCase13PalindromeCheckerApp {

    static final String APP_VERSION = "1.0";

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("======================================");
        System.out.println("   PALINDROME PERFORMANCE COMPARISON ");
        System.out.println("======================================");
        System.out.println("Application Version : " + APP_VERSION);
        System.out.println("======================================");

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String processed = normalize(input);

        
        long start1 = System.nanoTime();
        boolean result1 = twoPointerPalindrome(processed);
        long end1 = System.nanoTime();
        long time1 = end1 - start1;

    
        long start2 = System.nanoTime();
        boolean result2 = stackPalindrome(processed);
        long end2 = System.nanoTime();
        long time2 = end2 - start2;

        long start3 = System.nanoTime();
        boolean result3 = reverseStringPalindrome(processed);
        long end3 = System.nanoTime();
        long time3 = end3 - start3;

        // Display Results
        System.out.println("\n========= RESULTS =========");
        System.out.println("Two Pointer Result : " + result1 + " | Time: " + time1 + " ns");
        System.out.println("Stack Result       : " + result2 + " | Time: " + time2 + " ns");
        System.out.println("Reverse Result     : " + result3 + " | Time: " + time3 + " ns");

        scanner.close();
    }

    // Normalize input
    private static String normalize(String str) {
        return str.toLowerCase().replaceAll("[^a-z0-9]", "");
    }

    // Two Pointer Method
    private static boolean twoPointerPalindrome(String str) {
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

    // Stack Method
    private static boolean stackPalindrome(String str) {

        Stack<Character> stack = new Stack<>();

        for (char c : str.toCharArray()) {
            stack.push(c);
        }

        for (char c : str.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }
        return true;
    }

    // Reverse String Method
    private static boolean reverseStringPalindrome(String str) {
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }
}
