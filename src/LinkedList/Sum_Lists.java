package LinkedList;

import PublicClass.ListNode;

public class Sum_Lists {

    /*
    You have two numbers represented by a linked list, where each node contains a single digit.The digits are stored in reverse order, such that the 1 's digit is at the head of the list. Write a function that adds the two numbers and returns the sum as a linked list.
EXAMPLE
Input:(7-> 1 -> 6) + (5 -> 9 -> 2).Thatis,617 + 295. Output:2 -> 1 -> 9.Thatis,912.
FOLLOW UP
Suppose the digits are stored in forward order. Repeat the above problem. EXAMPLE
lnput:(6 -> 1 -> 7) + (2 -> 9 -> 5).That is,617 + 295. Output:9 -> 1 -> 2.Thatis,912.
     */

    //O(m + n)
    public int sumList(ListNode o1, ListNode o2) {
        return parseIntReverse(o1) + parseIntReverse(o2);
    }

    private int parseIntReverse(ListNode head) {
        StringBuilder builder = new StringBuilder();
        while (head != null) {
            builder.append(head.value);
            head = head.next;
        }
        return builder.length() == 0 ? 0 : Integer.parseInt(builder.reverse().toString());
    }

    private int parseInt(ListNode head) {
        int num = 0;
        while (head != null) {
            num = num * 10 + head.value;
            head = head.next;
        }
        return num;
    }

    //O(max(m, n))
    public int sumList2(ListNode o1, ListNode o2) {
        StringBuilder builder = new StringBuilder();
        int tenBit = 0;
        while (o1 != null || o2 != null) {
            int num1 = o1 == null ? 0 : o1.value;
            int num2 = o2 == null ? 0 : o2.value;
            int sum = num1 + num2 + tenBit;
            builder.append(sum%10);
            tenBit = sum / 10;
            if (o1 != null) o1 = o1.next;
            if (o2 != null) o2 = o2.next;
        }
        if (tenBit > 0) builder.append(tenBit);
        return builder.length() == 0 ? 0 : Integer.parseInt(builder.reverse().toString());
    }

    public int sumList3(ListNode o1, ListNode o2) {
        int res = 0, tenBit = 0;
        while (o1 != null || o2 != null) {
            int num1 = o1 == null ? 0 : o1.value;
            int num2 = o2 == null ? 0 : o2.value;
            int sum = num1 + num2;
            res += sum / 10;
            res = res * 10 + sum%10;
            if (o1 != null) o1 = o1.next;
            if (o2 != null) o2 = o2.next;
        }
        if (tenBit > 0) res = res * 10 + tenBit;
        return res;
    }

}
