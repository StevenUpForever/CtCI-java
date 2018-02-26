package linked_list;

import PublicClass.ListNode;

import java.util.Stack;

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
    用stack，slow fast pointer，slow 都push到stack里边，然后从stack里pop与slow++相比较
     */
    public boolean palindromeS2(ListNode head) {
        Stack<ListNode> stack = new Stack<>();
        ListNode slow = head, fast = head;
        while (fast.next != null) {
            stack.push(slow);
            slow = slow.next;
            fast = fast.next.next;
        }
        while (!stack.isEmpty() && slow != null) {
            if (slow.value != stack.pop().value) return false;
        }
        return true;
    }

}
