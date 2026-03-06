class Node {
char data;
Node next;

    Node(char d) {
        data = d;
        next = null;
    }
}

public class LinkedListPalindrome {

    Node head;

    // Insert at end
    void insert(char data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
    }

    // Check palindrome
    boolean isPalindrome() {
        String str = "";
        Node temp = head;

        while (temp != null) {
            str = str + temp.data;
            temp = temp.next;
        }

        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }

        return str.equals(rev);
    }

    public static void main(String[] args) {
        LinkedListPalindrome list = new LinkedListPalindrome();

        list.insert('m');
        list.insert('a');
        list.insert('d');
        list.insert('a');
        list.insert('m');

        if (list.isPalindrome())
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}

   