package linked_list;

import public_class.ListNode;

public class SumLists {

    /*
    You have two numbers represented by a linked list, where each node contains a single digit.The digits are stored in reverse order, such that the 1 's digit is at the head of the list. Write a function that adds the two numbers and returns the sum as a linked list.
EXAMPLE
Input:(7-> 1 -> 6) + (5 -> 9 -> 2).Thatis,617 + 295. Output:2 -> 1 -> 9.Thatis,912.
FOLLOW UP
Suppose the digits are stored in forward order. Repeat the above problem. EXAMPLE
lnput:(6 -> 1 -> 7) + (2 -> 9 -> 5).That is,617 + 295. Output:9 -> 1 -> 2.Thatis,912.
     */

    //O(max(m, n))
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode temp1 = l1, temp2 = l2;
        int len1 = 0, len2 = 0;
        while (temp1 != null) {
            temp1 = temp1.next;
            len1++;
        }
        while (temp2 != null) {
            temp2 = temp2.next;
            len2++;
        }
        ListNode res = new ListNode(0);
        //Ensure fist arg is smaller list and second is the larger list
        res.next = len1 < len2 ? addTwoNumbersHelper(l1, l2, len2 - len1) :
                addTwoNumbersHelper(l2, l1, len1 - len2);
        //At last the first node maybe over 9, then forward the carry and return res (new head node)
        if (res.next.value > 9) {
            res.value++;
            res.next.value %= 10;
            return res;
        }
        //Otherwise return recursion head as head node
        return res.next;
    }

    //Similar to reverse linked list in pair, put next to res of smaller problem
    private ListNode addTwoNumbersHelper(ListNode small, ListNode large, int k) {
        if (large == null) return null;
        ListNode sum = k == 0 ? new ListNode(small.value + large.value) : new ListNode(large.value);
        ListNode next = k == 0 ? addTwoNumbersHelper(small.next, large.next, 0) :
                addTwoNumbersHelper(small, large.next, k - 1);
        if (next != null && next.value > 9) {
            //Due to max value will be 9 + 9 = 18, so, will only have 1 carry to consider about at current bit
            sum.value++;
            next.value %= 10;
        }
        sum.next = next;
        return sum;
    }

}
