// UseCase8PalindromeCheckerApp.java

import java.util.Scanner;

// Main Application Class
public class UseCase8PalindromeCheckerApp {

    static final String APP_VERSION = "1.0";

    // Node class for Singly Linked List
    static class Node {
        char data;
        Node next;

        Node(char data) {
            this.data = data;
            this.next = null;
        }
    }

    // Head of Linked List
    static Node head = null;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Welcome Message
        System.out.println("======================================");
        System.out.println("     WELCOME TO PALINDROME CHECKER    ");
        System.out.println("======================================");
        System.out.println("Application Name : Palindrome Checker App");
        System.out.println("Application Version : " + APP_VERSION);
        System.out.println("======================================");

        // Input from user
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Convert string to linked list
        createLinkedList(input);

        // Check Palindrome
        boolean result = isPalindrome();

        if (result) {
            System.out.println("Result: The string is a PALINDROME.");
        } else {
            System.out.println("Result: The string is NOT a palindrome.");
        }

        scanner.close();
    }

    // Convert string to Singly Linked List
    public static void createLinkedList(String str) {
        head = null;

        for (int i = 0; i < str.length(); i++) {
            Node newNode = new Node(str.charAt(i));

            if (head == null) {
                head = newNode;
            } else {
                Node temp = head;
                while (temp.next != null) {
                    temp = temp.next;
                }
                temp.next = newNode;
            }
        }
    }

    // Check Palindrome using Linked List
    public static boolean isPalindrome() {

        if (head == null || head.next == null) {
            return true;
        }

        Node slow = head;
        Node fast = head;

        // Find middle using Fast & Slow Pointer
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Reverse second half
        Node secondHalf = reverse(slow);
        Node firstHalf = head;

        // Compare both halves
        while (secondHalf != null) {
            if (firstHalf.data != secondHalf.data) {
                return false;
            }
            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }

        return true;
    }

    // Reverse Linked List (In-place Reversal)
    public static Node reverse(Node node) {
        Node prev = null;
        Node current = node;
        Node next = null;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        return prev;
    }
}
