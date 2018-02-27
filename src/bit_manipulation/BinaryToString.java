package bit_manipulation;

public class BinaryToString {

    /*
    Given a real number between O and 1 (e.g., 0.72) that is passed in as a double, print the binary representation. If the number cannot be represented accurately in binary with at most 32 characters, print "ERROR:'
     */

    /*
    不是转换小数，而只是将小数部分当整数使用
     */
    String binaryToString(double num) {
        if (num >= 1 || num <= 0) return "ERROR";
        StringBuilder builder = new StringBuilder(".");
        while (num > 0) {
            //Over 32 bit int
            if (builder.length() >= 32) return "ERROR";
            double r = num * 2;
            builder.append(r >= 1 ? 1 : 0);
            num = r >= 1 ? r - 1 : r;
        }
        return builder.toString();
    }

}
