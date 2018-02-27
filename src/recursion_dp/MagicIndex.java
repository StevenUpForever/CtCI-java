package recursion_dp;

public class MagicIndex {

    public int magicIndex(int[] A) {
        for (int i = 0; i < A.length; i++) {
            if (A[i] > i) return -1;
            if (A[i] == i) return i;
        }
        return -1;
    }

    //在sorted array里查找，用binary search
    /*
    if A[i] == i return i
    if A[i] < i 向右找，
    else 向左找

     */
    public int magicIndex2(int[] A) {
        int left = 0, right = A.length - 1;
        while (left <= right) {
            int mid = left + (right - left)/2;
            if (A[mid] == mid) return mid;
            else if (A[mid] > mid) right = mid - 1;
            else left = mid + 1;
        }
        return -1;
    }

}
