package LinkedList;

import PublicClass.ListNode;

public class Partition {

    /*
    Write code to partition a linked list around a value x, such that all nodes less than x come before all nodes greater than or equal to x. If x is contained within the list, the values of x only need to be after the elements less than x (see below). The partition element x can appear anywhere in the "right partition"; it does not need to appear between the left and right partitions.
EXAMPLE
Input: 3 -> 5 -> 8 -> 5 -> 10 -> 2 -> 1[partition=5] Output: 3 -> 1 -> 2 -> 10 -> 5 -> 5 -> 8
     */

    ListNode Partition(ListNode head, int partition) {
        ListNode dum1 = new ListNode(0), dum2 = new ListNode(0);
        ListNode node1 = dum1, node2 = dum2;
        while (head != null) {
            if (head.value < partition) {
                dum1.next = head;
                dum1 = dum1.next;
            } else {
                dum2.next = head;
                dum2 = dum2.next;
            }
            head = head.next;
        }
        dum1.next = node2.next;
        return dum1.next;
    }

}
