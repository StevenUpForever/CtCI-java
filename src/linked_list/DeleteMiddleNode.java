package linked_list;

import PublicClass.ListNode;

public class DeleteMiddleNode {

    /*
    Implement an algorithm to delete a node in the middle (i.e., any node but the  rst and last node, not necessarily the exact middle) of a singly linked list, given only access to that node.
EXAMPLE
lnput:the node c from the linked lista->b->c->d->e->f
Result: nothing is returned, but the new linked list looks likea->b->d->e- >f
     */

    /*
    slow fast pointers, fast go 2 steps, and slow go 1 step
     */

    ListNode removeMid(ListNode head) {
        ListNode res = head;
        ListNode slow = head, fast = head;
        ListNode pre = null;
        while (fast.next != null && fast.next.next != null) {
            pre = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        if (slow != head && slow != null && slow.next != null) {
            pre.next = slow.next;
        }
        return res;
    }

}
