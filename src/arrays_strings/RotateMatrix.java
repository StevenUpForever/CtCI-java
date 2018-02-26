package arrays_strings;

public class RotateMatrix {

    /*
    Given an image represented by an NxN matrix, where each pixel in the image is 4 bytes, write a method to rotate the image by 90 degrees. Can you do this in place?
     */

    public void rotate(int[][] matrix) {
        if (matrix == null || matrix.length <= 1) return;
        int len = matrix.length;
        for (int i = 0; i < len/2; i++) { //len/2是offset，最多到1/2为起点
            int right = len - 2 - i; //len - 2 - i 是这一行last second element，因为第一个要和最后一个做比较
            for (int j = i; j <= right; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[len - j - 1][i];
                matrix[len - j - 1][i] = matrix[len - i - 1][len - j - 1];
                matrix[len - i - 1][len - j - 1] = matrix[j][len - 1 - i];
                matrix[j][len - 1 - i] = temp;
            }
        }
    }

}
