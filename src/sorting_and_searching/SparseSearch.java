package sorting_and_searching;

public class SparseSearch {

    /*
    Given a sorted array of strings that is interspersed with empty strings,
    write a method to find the location of a given string.
    EXAMPLE "", '"', "",
    Input: ball,{"at", "ball", "", "",}
     */

    /*
    Solution:
    key point 是当mid是""时，由 mid - 1, mid + 1 向两边expand找到第一个不是""string作为mid

    Time: O(n)
    Space: O(1)
     */
    int search(String[] strs, String str) {
        int l = 0, r = str.length() - 1;
        while (l <= r) {
            int mid = l + (r - l)/2;
            if (strs[mid].isEmpty()) mid = findMid(strs, mid, l, r);
            if (mid == - 1 || strs[mid].equals(str)) return mid;
            else if (strs[mid].compareTo(str) > 0) r = mid - 1;
            else l = mid + 1;
        }
        return -1;
    }

    private int findMid(String[] strs, int mid, int left, int right) {
        int l = mid - 1, r = mid + 1;
        while (l >= left || r <= right) {
            if (r <= right && !strs[r].isEmpty()) return r;
            else if (l >= left && !strs[l].isEmpty()) return l;
            l--;
            r++;
        }
        return -1;
    }

}
