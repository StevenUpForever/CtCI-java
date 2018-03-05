package sorting_and_searching;

public class SearchInRotatedArray {

    /*
    Given a sorted array of n integers that has been rotated an unknown number of times, write code to  nd an element in the array. You may assume that the array was originally sorted in increasing order.

    EXAMPLE
lnput:findSin{lS, 16, 19, 20, 25, 1, 3, 4, 5, 7, 10, 14} Output: 8 (the index of 5 in the array)
     */

    public int rotatedSearch(int[] arr, int n) {
        int l = 0, r = arr.length - 1;
        while (l <= r) {
            int mid = l + (r - l)/2;
            if (arr[mid] == n) return mid;
            else if (arr[mid] > arr[l]) {
                if (arr[mid] > n) r = mid - 1;
                l = mid + 1;
            } else {
                if (arr[mid] < n) l = mid + 1;
                r = mid - 1;
            }
        }
        return -1;
    }



}
