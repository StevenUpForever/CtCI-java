package Arrays_Strings;

import java.util.HashMap;

public class One_Away {

    /*
    There are three types of edits that can be performed on strings: insert a character, remove a character, or replace a character. Given two strings, write a function to check if they are one edit (or zero edits) away.
EXAMPLE
pale, ple -> true pales, pale -> true pale, bale -> true pale, bake -> false
     */

    public boolean oneWay(String s, String p) {
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
            if (!map.containsKey(c)) count++;
            if (count > 1) return false;
            Integer curVal = map.get(c);
            if (curVal <= 0) count++;
            if (count > 1) return false;
            map.put(c, curVal - 1);
        }

        return true;
    }

}
