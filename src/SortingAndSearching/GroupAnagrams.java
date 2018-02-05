package SortingAndSearching;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

public class GroupAnagrams {

    /*
    Write a method to sort an array of strings so that all the anagrams are next to each other.
     */

    /*
    Use custom Comparator来sort
     */

    String[] groupAnagrams(String[] strs) {
        Arrays.sort(strs, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return strCompare(o1, o2);
            }
        });
        return strs;
    }

    private int strCompare(String a, String b) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < a.length(); i++) {
            char key = a.charAt(i);
            if (!map.containsKey(key)) map.put(key, 1);
            map.put(key, map.get(key) + 1);
        }
        for (int j = 0; j < b.length(); j++) {
            char key = b.charAt(j);
            if (!map.containsKey(key) || map.get(key) <= 0) return 1;
            map.put(key, map.get(key)-1);
        }
        for (Character key: map.keySet()) if (map.get(key) > 0) return 1;
        return -1;
    }

}
