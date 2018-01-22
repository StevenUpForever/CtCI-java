package Arrays_Strings;

public class String_Rotation {

    /*
    Assumeyou have a method isSubstringwhich checks if one word is a substring of another. Given two strings, sl and s2, write code to check if s2 is a rotation of sl using only one call to isSubstring (e.g.,"waterbottle" is a rotation of"erbottlewat").
     */

    /*
    Solution:
    if x can rotate to y, then y is substring of xx
     */

    public boolean isRotated(String origin, String rotate) {
        if (origin == null && rotate == null) return true;
        if (origin == null || rotate == null || origin.length() != rotate.length())return false;
        return isSubstring(origin + origin, rotate);
    }

    boolean isSubstring(String s, String p) {
        return true;
    }


}
