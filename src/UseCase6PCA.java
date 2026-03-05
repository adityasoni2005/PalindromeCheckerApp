import java.util.Scanner;
import java.util.Stack;
import java.util.LinkedList;
import java.util.Queue;

public class UseCase6PCA {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Initialize Stack (LIFO) and Queue (FIFO)
        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();

        // Push to stack and enqueue to queue
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            stack.push(c);
            queue.add(c);
        }

        // Compare pop from stack with dequeue from queue
        boolean isPalindrome = true;

        while (!stack.isEmpty() && !queue.isEmpty()) {
            if (stack.pop() != queue.remove()) {
                isPalindrome = false;
                break;
            }
        }

        // Display result
        if (isPalindrome) {
            System.out.println("The given string is a Palindrome.");
        } else {
            System.out.println("The given string is NOT a Palindrome.");
        }

        scanner.close();
    }
}