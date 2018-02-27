package linked_list;

import public_class.ListNode;

public class ReturnKthToLast {

    /*
    Implement an algorithm to find the kth to last element of a singly linked list.
     */
    /*
    fast slow pointer, 1st loop fast k times, if list.len < k then just return head
    else loop slow from beginning along with fast together, until fast == null, then slow is the result
     */

    public ListNode KthToLast(ListNode head, int k) {
        ListNode fast = head;
        while (k > 0) {
            if (fast == null) return head;
            fast = fast.next;
            k--;
        }
        ListNode slow = head;
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }


}
