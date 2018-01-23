package LinkedList;

import PublicClass.ListNode;

import java.util.HashSet;

public class Loop_Detection {

    /*
    Given a circular linked list, implement an algorithm that returns the node at the
beginning of the loop.
DEFINITION
Circular linked list: A (corrupt) linked list in which a node's next pointer points to an earlier node, so as to make a loop in the linked list.
EXAMPLE
Input: A -> B -> C -> D -> E -> C[thesameCasearlier]
Output: C
     */

    ListNode circular(ListNode head) {
        HashSet<ListNode> set = new HashSet<>();
        while (set.add(head)) head = head.next;
        return head;
    }

    /*
    证明：non-loop size = k, loop circle size == circle, 则当slow到circle起点时，fast 比 slow快k，因为走了2k，问题变成，每次fast
    比slow多走1，多长时间可以从circle的k走到起点，时间是circle - k
    此时，表示slow与fast重合，位置在circle - k的地方，此时slow = start，slow 与 fast 同时 move by 1，再次重合的点就是circle起点
     */

    ListNode circular2(ListNode head) {
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) break;
        }
        if (fast == null || fast.next == null) return null;
        slow = head;
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }
        return fast;
    }

}
