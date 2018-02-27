package sorting_and_searching;

public class SortedMerge {

    /*
    You are given two sorted arrays, A and B, where A has a large enough buffer at the end to hold B. Write a method to merge B into A in sorted order.
     */

    /*
    Selection sort
     */

    /*
    Use two pointers
     */

    int[] sortedMerge(int[] a, int[] b) {
        int i = 0, j = 0;
        int[] res = new int[a.length + b.length];
        int index = 0;
        while (i < a.length || j < b.length) {
            int val1 = i < a.length ? a[i] : Integer.MAX_VALUE;
            int val2 = j < b.length ? b[j] : Integer.MAX_VALUE;
            if (val1 < val2) {
                res[index++] = val1;
                i++;
            } else {
                res[index++] = val2;
                j++;
            }
        }
        return res;
    }

}
