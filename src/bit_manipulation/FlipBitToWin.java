package bit_manipulation;

public class FlipBitToWin {

    /*
    You have an integer and you can flip exactly one bit from a 0 to a 1. Write code to  nd the length of the longest sequence of ls you could create.
EXAMPLE
Input: 1775 (or: 11011101111) Output: 8
     */

    int FlopBitToWin(int n) {
        int count = 0;
        while (n > 0) {
            count += n & 1;
            n >>= 1;
        }
        return count;
    }

}
