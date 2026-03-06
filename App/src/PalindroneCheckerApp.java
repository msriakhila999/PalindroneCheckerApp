
import java.util.Scanner;

public class PalindroneCheckerApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        String normalized = input.replaceAll("\\s+", "").toLowerCase();
        String reversed = new StringBuilder(normalized).reverse().toString();

        if (normalized.equals(reversed)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
    }
}
