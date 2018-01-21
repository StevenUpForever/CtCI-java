package Arrays_Strings;

import java.util.HashMap;

public class Palindrome_Permutation {

    /*
    Given a string, write a function to check if it is a permutation of a palin­ drome. A palindrome is a word or phrase that is the same  rwards and backwards. A permutation is a rearrangement of letters. The palindrome does not need to be limited to just dictionary words.
EXAMPLE
Input: Tact Coa
Output: True (permutations: "taco cat", "atco eta", etc.)
     */

    public boolean isPaliPerm(String s, String p) {
        if (!isPal(s)) return false;
        if (s == null && p == null) return true;
        if (s == null || p == null || s.length() != p.length()) return false;
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < p.length(); i++) {
            char c = p.charAt(i);
            if (!map.containsKey(c))
                map.put(c, 0);
            map.put(c, map.get(c) + 1);
        }
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!map.containsKey(c)) return false;
            Integer curVal = map.get(c);
            if (curVal <= 0) return false;
            map.put(c, curVal - 1);
            count++;
        }
        return count == s.length();
    }

    private boolean isPal(String s) {
        if (s == null) return true;
        int i = 0, j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }

}
