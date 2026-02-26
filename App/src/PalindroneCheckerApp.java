import java.util.Deque;
import java.util.ArrayDeque;

public class PalindroneCheckerApp {
    public static void main(String[] args) {
        String input = "refer";
        System.out.println("Input : " + input);
        Deque<Character> deque = new ArrayDeque<>();
        for (char c : input.toCharArray()) {
            deque.addLast(c);
        }
        boolean isPalindrome = true;
        while (deque.size() > 1) {
            char first = deque.removeFirst();
            char last = deque.removeLast();

            if (first != last) {
                isPalindrome = false;
                break;
            }
        }
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}
