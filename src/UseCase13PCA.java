import java.util.Scanner;
import java.util.Stack;
import java.util.Deque;
import java.util.LinkedList;

public class UseCase13PCA{

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // --- Stack Approach ---
        long startStack = System.nanoTime();
        boolean stackResult = checkPalindromeStack(input);
        long endStack = System.nanoTime();
        long stackTime = endStack - startStack;

        // --- Deque Approach ---
        long startDeque = System.nanoTime();
        boolean dequeResult = checkPalindromeDeque(input);
        long endDeque = System.nanoTime();
        long dequeTime = endDeque - startDeque;

        // --- Two-pointer Approach (Case-sensitive) ---
        long startTwoPointer = System.nanoTime();
        boolean twoPointerResult = checkPalindromeTwoPointer(input);
        long endTwoPointer = System.nanoTime();
        long twoPointerTime = endTwoPointer - startTwoPointer;

        // Display results
        System.out.println("\n--- Performance Comparison ---");
        System.out.printf("Stack Approach: %b, Time = %d ns\n", stackResult, stackTime);
        System.out.printf("Deque Approach: %b, Time = %d ns\n", dequeResult, dequeTime);
        System.out.printf("Two-Pointer Approach: %b, Time = %d ns\n", twoPointerResult, twoPointerTime);

        scanner.close();
    }

    // Stack-based palindrome
    private static boolean checkPalindromeStack(String input) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != stack.pop()) return false;
        }
        return true;
    }

    // Deque-based palindrome
    private static boolean checkPalindromeDeque(String input) {
        Deque<Character> deque = new LinkedList<>();
        for (int i = 0; i < input.length(); i++) {
            deque.addLast(input.charAt(i));
        }
        while (deque.size() > 1) {
            if (!deque.removeFirst().equals(deque.removeLast())) return false;
        }
        return true;
    }

    // Two-pointer approach
    private static boolean checkPalindromeTwoPointer(String input) {
        int start = 0;
        int end = input.length() - 1;
        while (start < end) {
            if (input.charAt(start) != input.charAt(end)) return false;
            start++;
            end--;
        }
        return true;
    }
}