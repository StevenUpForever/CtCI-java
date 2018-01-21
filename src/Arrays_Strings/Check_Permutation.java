package Arrays_Strings;

import java.util.HashMap;

public class Check_Permutation {

    /*
    Given two strings,write a method to decide if one is a permutation of the
other.
     */

    /*
    check frequency of each char is same
    if ASCII chars, use char[26], if not, use HashMap, key is char, value is frequency
    1. put char and frequency of p in map
    2. loop s
        (1) if met char not in map, return false
        (2) else delete frequency, increase count by 1
    if count could be s.length finally, then is permutation (s maybe 0 length, and count initial is 0, but already check s.len != p.len at corner case)
    Time: O(n)
    Space: O(n)
     */

    public boolean isPermutation(String s, String p) {
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

}
