package recursion_dp;

import java.util.ArrayList;
import java.util.List;

public class EightQueens {

    /*
    Write an algorithm to print all ways of arranging eight queens on an 8x8 chess board so that none of them share the same row, column, or diagonal. In this case, "diagonal" means all diagonals, not just the two that bisect the board.
     */

    /*
    Time: O(n!)
    Space: O(n)
     */

    public List<List<Integer>> nqueens(int n) {
        List<List<Integer>> res = new ArrayList<>();
        if (n == 0) return res;
        List<Integer> list = new ArrayList<>();
        addQueen(res, list, n);
        return res;
    }

    private void addQueen(List<List<Integer>> res, List<Integer> list, int n) {
        if (list.size() == n) {
            res.add(new ArrayList<>(list));
            return;
        }
        for (int i = 0; i < n; i++) {
            if (passCheck(list, i)) {
                list.add(i);
                addQueen(res, list, n);
                list.remove(list.size() - 1);
            }
        }
    }

    private boolean passCheck(List<Integer> list, int col) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == col || Math.abs(list.get(i) - col) == list.size() - i) return false;
        }
        return true;
    }



}
