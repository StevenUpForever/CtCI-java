package recursion_dp;

import java.util.ArrayList;
import java.util.List;

public class Parens {

    /*
    Implement an algorithm to print all valid (e.g., properly opened and closed) combinations of n pairs of parentheses.
EXAMPLE
Input: 3
Output: ((())), (()()), (())(), ()(()), ()()()
     */

    public List<String> parens(int n) {
        List<String> list = new ArrayList<>();
        parensHelper(list, new StringBuilder(), 0, 0, n);
        return list;
    }

    private void parensHelper(List<String> res, StringBuilder builder, int l, int r, int n) {
        if (l + r == n * 2) {
            res.add(builder.toString());
            return;
        }
        if (l < n) {
            builder.append("(");
            parensHelper(res, builder, l + 1, r, n);
            builder.deleteCharAt(builder.length() - 1);
        }
        if (r < l) {
            builder.append(")");
            parensHelper(res, builder, l, r + 1, n);
            builder.deleteCharAt(builder.length() - 1);
        }
    }

}
