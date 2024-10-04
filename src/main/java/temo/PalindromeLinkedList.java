package temo;

import java.util.ArrayList;
import java.util.List;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class PalindromeLinkedList {

    public boolean isPalindrome(ListNode head) {
        List<Integer> values = new ArrayList<>();

        // Step 1: Traverse the linked list and store the values in the list
        ListNode currentNode = head;
        while (currentNode != null) {
            values.add(currentNode.val);
            currentNode = currentNode.next;
        }

        // Step 2: Check if the list of values is a palindrome
        int start = 0;
        int end = values.size() - 1;
        while (start < end) {
            if (!values.get(start).equals(values.get(end))) {
                return false; // Not a palindrome
            }
            start++;
            end--;
        }

        return true; // Is a palindrome
    }

    public static void main(String[] args) {
        // Example: Creating a linked list 1 -> 2 -> 2 -> 1
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(1);

        PalindromeLinkedList solution = new PalindromeLinkedList();
        boolean result = solution.isPalindrome(head);

        System.out.println("Is palindrome: " + result); // Expected output: true
    }
}
