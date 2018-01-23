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

    /*
    solution 2:
    用stack，slow fast pointer，slow 都push到stack里边，然后从stack里pop与fast相比较（fast此时应该move by 1）
     */

    //TODO: recursion solution 3

}
