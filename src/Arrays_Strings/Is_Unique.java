package Arrays_Strings;

import java.util.HashSet;

public class Is_Unique {

    /*
    Implement an algorithm to determine if a string has all unique characters. What if you cannot use additional data structures?
     */

    /*
    If could use more space
    1. if string is sorted in someway, then could loop and check if i - 1 != i
    2. if s contains only ASCII chars or unicode chars, if ASCII could use char[26] to filter dup chars
    3. if others, use set to filter dup chars

    Time: O(n)
    Space: O(n)
     */
    public boolean isUnique(String s) {
        if (s == null) return true;
        HashSet<Character> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            if (!set.add(s.charAt(i))) return false;
        }
        return true;
    }

    /*
    If no extra space or data structure
    for for loop compare chars

    Time: O(n^2)
    Space: O(1)
     */
    public boolean isUnique2(String s) {
        if (s == null) return true;
        for (int i = 0; i < s.length() - 1; i++) {
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) return false;
            }
        }
        return true;
    }


}
