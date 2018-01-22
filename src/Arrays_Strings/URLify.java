package Arrays_Strings;

import java.util.ArrayList;
import java.util.List;

public class URLify {

    /*
    Write a method to replace all spaces in a string with '%20  You may assume that the string has suf cient space at the end to hold the additional characters,and that you are given the "true" length of the string. (Note: If implementing in Java,please use a character array so that you can perform this operation in place.)
EXAMPLE
Input: "Mr John Smith ", 13 Output: "Mr%20John%20Smith"
     */



    /*
    for loop the string, put all words in a string array
    append strings in array together and add %20 between each other
    Time: O(2n) = O(n)
    Space: O(n)
     */
    public String URLify(String s) {
        if (s == null) return s;
        List<String> list = new ArrayList<>();
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                if (i > 0 && s.charAt(i - 1) != ' ') {
                    list.add(str.toString());
                    str = new StringBuilder();
                }
            } else {
                str.append(s.charAt(i));
            }
        }
        if (str.length() > 0) list.add(str.toString());
        String res = list.get(0);
        for (int j = 1; j < list.size(); j++)
            res = res + "%20" + list.get(j);
        return res;
    }

}
