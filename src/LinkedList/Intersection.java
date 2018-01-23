package LinkedList;

import PublicClass.ListNode;

import java.util.HashSet;

public class Intersection {

    /*
    Given two (singly) linked lists, determine if the two lists intersect. Return the inter­ secting node. Note that the intersection is de ned based on reference, not value.That is, if the kth node of the  rst linked list is the exact same node (by reference) as the jth node of the second linked list, then they are intersecting.
     */

    /*
    因为比较reference，所以不用考虑是否是排序的, 因为一个node只有一个next，如果有intersect，证明某一条or两条list的end是这个intersection，
    like a "Y"
     */

    /*
    1.
    for for loop to find intersect
     */
    /*
    HashSet
     */


    ListNode intersect(ListNode o1, ListNode o2) {
        HashSet<ListNode> set = new HashSet<>();
        while (o1 != null && o2 != null) {
            if (!set.add(o1)) return o1;
            if (!set.add(o2)) return o2;
            o1 = o1.next;
            o2 = o2.next;
        }
        return null;
    }

}
