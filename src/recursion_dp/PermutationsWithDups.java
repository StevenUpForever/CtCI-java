package recursion_dp;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class PermutationsWithDups {

    /*
    Write a method to compute all permutations of a string whose characters are not necessarily unique.
    The list of permutations should not have duplicates.
     */

    public List<String> allPermutations(String s) {
        List<String> list = new ArrayList<>();
        allPermutationsHelper(list, s.toCharArray(), 0);
        return list;
    }

    /*
    用HashMap来filter因为同样重复的char会在此一层的之后某一层开始swap，不需要本层swap，所以swap重复了

     */
    private void allPermutationsHelper(List<String> res, char[] chars, int index) {
        if (index >= chars.length) {
            res.add(new String(chars));
            return;
        }
        HashSet<Character> set = new HashSet<>();
        for (int i = index; i < chars.length; i++) {
            if (set.add(chars[i])) {
                swap(chars, i, index);
                set.add(chars[i]);
                allPermutationsHelper(res, chars, index + 1);
                //因为本层只swap一个char，所以在1与3swap之前需要将1和2swap回去
                swap(chars, i, index);
                //注意不要将char从set里删除，否则不能删选之后重复的部分
            }
        }
    }

    private void swap(char[] chars, int x, int y) {
        char c = chars[x];
        chars[x] = chars[y];
        chars[y] = c;
    }

}
