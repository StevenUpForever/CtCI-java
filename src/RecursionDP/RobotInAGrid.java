package RecursionDP;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class RobotInAGrid {

    /*
    Imagine a robot sitting on the upper left corner of grid with r rows and c columns. The robot can only move in two directions, right and down, but certain cells are "off limits" such that the robot cannot step on them. Design an algorithm to find a path for the robot from the top left to the bottom right.
     */

    public List<Cell> robotInAGrid(Cell[][] matrix) {
        List<Cell> list = new LinkedList<>();
        if (matrix.length == 0 || matrix[0].length == 0) return list;
        robotInAGridHelper(matrix, list, matrix[0][0]);
        return list;
    }

    private void robotInAGridHelper(Cell[][] matrix, List<Cell> list, Cell cell) {
        if (!cell.isValid) return;
        if (cell.x == matrix.length - 1 && cell.y == matrix[0].length - 1) {
            list.add(cell);
            return;
        }
        list.add(cell);
        if (cell.x < matrix.length) robotInAGridHelper(matrix, list, matrix[cell.x + 1][cell.y]);
        if (cell.y < matrix[0].length) robotInAGridHelper(matrix, list, matrix[cell.x][cell.y + 1]);
        list.remove(list.size() - 1);
    }

    class Cell {
        int x;
        int y;
        boolean isValid;
        public Cell(int x, int y, boolean isValid) {
            this.x = x;
            this.y = y;
            this.isValid = isValid;
        }
    }

}
