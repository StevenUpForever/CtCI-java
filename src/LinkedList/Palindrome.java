package LinkedList;

import PublicClass.ListNode;

public class Palindrome {
    /*
    Implement a function to check if a linked list is a palindrome.
     */
    public boolean palindrome(ListNode head) {
        ListNode reverse = reverse(head);
        while (reverse != head) {
            if (reverse.value != head.value) return false;
            reverse = reverse.next;
            head = head.next;
        }
        return true;
    }

    private ListNode reverse(ListNode head) {
        ListNode pre = null;
        while (head != null) {
            ListNode next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        return pre;
    }

}
