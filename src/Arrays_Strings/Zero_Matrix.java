package Arrays_Strings;

public class Zero_Matrix {

    /*
    Write an algorithm such that if an element in an MxN matrix is 0, its entire row and column are set to 0.
     */

    public void setTo0(int[][] matrix) {
        if (matrix == null || matrix.length == 0) throw new NullPointerException();
        int row = matrix.length, col = matrix[0].length;
        boolean[][] zeroMatrix = new boolean[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                zeroMatrix[i][j] = matrix[i][j] == 0;
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (zeroMatrix[i][j]) {
                    int left = j - 1;
                    while (left >= 0) matrix[i][left--] = 0;
                    int right = j + 1;
                    while (right < col) matrix[i][right++] = 0;
                    int up = i - 1;
                    while (up >= 0) matrix[up--][j] = 0;
                    int down = i + 1;
                    while (down < row) matrix[down++][j] = 0;
                }
            }
        }
    }

}
