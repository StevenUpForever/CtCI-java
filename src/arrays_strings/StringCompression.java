package arrays_strings;

public class StringCompression {

    /*
    Implement a method to perform basic string compression using the counts of repeated characters. For example, the string aabcccccaaa would become a2blc5a3. If the "compressed" string would not become smaller than the original string, your method should return
the original string. You can assume the string has only uppercase and lowercase letters (a - z).
     */

    /*
    1 cal how many spaces need to add, if > 0, return s
    then alloc string with new space, add from end to start
     */

    /*
    from Java, alloc a stringBuilder, if cur end char in builder is not the one loop in s, append count and append new char
     */

    public String compression(String s) {
        if (s == null) return s;
        StringBuilder builder = new StringBuilder();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (builder.length() == 0 || builder.charAt(builder.length() - 1) != s.charAt(i)) {
                builder.append(count);
                builder.append(s.charAt(i));
                count = 1;
            } else count++;
        }
        builder.append(count);
        return builder.length() < s.length() ? builder.toString() : s;
    }

}
