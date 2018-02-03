package RecursionDP;

import java.util.ArrayList;
import java.util.List;

public class PermutationsWithoutDups {

    /*
    Write a method to compute all permutations of a string of unique characters.
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
        for (int i = index; i < chars.length; i++) {
            swap(chars, i, index);
            allPermutationsHelper(res, chars, index + 1);
            swap(chars, i, index);
        }
    }

    private void swap(char[] chars, int x, int y) {
        char c = chars[x];
        chars[x] = chars[y];
        chars[y] = c;
    }

}
