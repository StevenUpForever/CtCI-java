package sorting_and_searching;

public class SortedMatrixSearch {

    /*
    Given an M x N matrix in which each row and each column is sorted in ascending order,
    write a method to find an element.
     */


    int[] sortMatrix(int[][] matrix, int n) {
        if (matrix == null || matrix.length == 0) return new int[]{-1, -1};
        int row = matrix.length, col = matrix[0].length;
        int l = 0, r = row * col - 1;
        while (l <= r) {
            int mid = l + (r - l)/2;
            int rowNum = mid / col, colNum = mid % col;
            if (matrix[rowNum][colNum] == n) return new int[]{rowNum, colNum};
            else if (matrix[rowNum][colNum] < n) l = mid + 1;
            else r = mid - 1;
        }
        return new int[]{-1, -1};
    }

}
