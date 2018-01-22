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

    /*
    因为最后要将整行，整列置于0，所以只需要记录这一行or这一列是否有0即可
    boolean[] row = new boolean[matrix.len]
    boolean[] col = new boolean[matrix[0].len]
    if matrix[i][j] == 0 row[i] = 0, col[j] = 0
     */

    /*
    可以将[i,0] [0, j]置于0，先标记第一行和第一列是否应该置于0
    loop第一遍，有0的行第一个和列第一个标为0
    loop第二遍只有行，和只有列，置于0
    ****** 最后处理第一行和第一列，避免错误的0 ******
    loop最后一遍将第一行和第一列置于0如果需要的话
     */


}
