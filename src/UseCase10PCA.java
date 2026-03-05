import java.util.Scanner;

public class UseCase10PCA {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Normalize string: remove spaces & convert to lower case
        String normalized = input.replaceAll("\\s+", "").toLowerCase();

        // Check palindrome using two-pointer approach
        boolean isPalindrome = true;
        int start = 0;
        int end = normalized.length() - 1;

        while (start < end) {
            if (normalized.charAt(start) != normalized.charAt(end)) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        // Display result
        if (isPalindrome) {
            System.out.println("The given string is a Palindrome (case & space ignored).");
        } else {
            System.out.println("The given string is NOT a Palindrome (case & space ignored).");
        }

        scanner.close();
    }
}