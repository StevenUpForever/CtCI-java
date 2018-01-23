package LinkedList;

import PublicClass.ListNode;

import java.util.HashSet;

public class Remove_Dups {
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
            ListNode cur = head.next, pre = head;
            while (cur != null) {
                if (head.value == cur.value) {
                    pre.next = cur.next;
                    cur = null;
                }
                pre = cur;
                cur = cur.next;
            }
            head = head.next;
        }
        return res;
    }


}
