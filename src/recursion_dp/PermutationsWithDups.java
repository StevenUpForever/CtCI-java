package recursion_dp;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class PermutationsWithDups {

    /*
    Write a method to compute all permutations of a string whose charac­ ters are not necessarily unique. The list of permutations should not have duplicates.
     */

    public List<String> allPermutations(String s) {
        List<String> list = new ArrayList<>();
        allPermutationsHelper(list, s.toCharArray(), 0);
        return list;
    }

    private void allPermutationsHelper(List<String> res, char[] chars, int index) {
        if (index >= chars.length) {
            res.add(chars.toString());
            return;
        }
        HashSet<Character> set = new HashSet<>();
        for (int i = index; i < chars.length; i++) {
            if (set.add(chars[i])) {
                swap(chars, i, index);
                set.add(chars[i]);
                allPermutationsHelper(res, chars, index + 1);
                swap(chars, i, index);
                set.remove(chars[i]);
            }
        }
    }

    private void swap(char[] chars, int x, int y) {
        char c = chars[x];
        chars[x] = chars[y];
        chars[y] = c;
    }

}
