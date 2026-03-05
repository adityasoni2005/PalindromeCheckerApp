import java.util.Scanner;

public class UseCase9PCA {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Check palindrome recursively
        if (isPalindromeRecursive(input, 0, input.length() - 1)) {
            System.out.println("The given string is a Palindrome.");
        } else {
            System.out.println("The given string is NOT a Palindrome.");
        }

        scanner.close();
    }

    // Recursive function to check palindrome
    private static boolean isPalindromeRecursive(String str, int start, int end) {
        // Base condition: crossed indices
        if (start >= end) return true;

        // If characters don't match
        if (str.charAt(start) != str.charAt(end)) return false;

        // Recursive call moving inward
        return isPalindromeRecursive(str, start + 1, end - 1);
    }
}