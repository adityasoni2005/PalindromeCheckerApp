import java.util.Scanner;
import java.util.Stack;

// PalindromeChecker class encapsulates the logic
class PalindromeChecker {

    // Method to check palindrome using stack
    public boolean checkPalindrome(String input) {
        Stack<Character> stack = new Stack<>();

        // Push all characters into stack
        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }

        // Pop from stack and compare
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != stack.pop()) {
                return false;
            }
        }

        return true;
    }
}

// Main application class
public class UseCase11PCA {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Use PalindromeChecker service
        PalindromeChecker checker = new PalindromeChecker();
        boolean isPalindrome = checker.checkPalindrome(input);

        // Display result
        if (isPalindrome) {
            System.out.println("The given string is a Palindrome.");
        } else {
            System.out.println("The given string is NOT a Palindrome.");
        }

        scanner.close();
    }
}