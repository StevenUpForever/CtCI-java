package linked_list;

import PublicClass.ListNode;

import java.util.HashSet;

public class RemoveDups {
    /*
    Write code to remove duplicates from an unsorted linked list.
     */

    /*
    Use HashSet to filter the node
     */
    public ListNode removeDup(ListNode head) {
        ListNode res = head;
        HashSet<ListNode> set = new HashSet<>();
        ListNode pre = null;
        while (head != null) {
            if (!set.add(head)) {
                pre.next = head.next;
                head = null;
            }
            pre = head;
            head = head.next;
        }
        return res;
    }

    /*
    If cannot use buffer
    for for loop the head, and remove dups
     */
    public ListNode removeDup2(ListNode head) {
        ListNode res = head;
        while (head != null) {
            ListNode cur = head;
            while (cur.next != null) {
                if (cur.next.value != head.value) {
                    //Stop cur at here, not sure if next one is dup again
                    cur.next = cur.next.next;
                } else cur = cur.next;
            }
            head = head.next;
        }
        return res;
    }


}
