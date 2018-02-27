package bit_manipulation;

public class FlipBitToWin {

    /*
    You have an integer and you can flip exactly one bit from a 0 to a 1. Write code to  nd the length of the longest sequence of ls you could create.
EXAMPLE
Input: 1775 (or: 11011101111) Output: 8
     */

    /*
    Solution:
    *** similar to max length subarray ***
    increase curLen by 1 when keep met 1
    when met 0, check next bit of 0 is 0 or 1, if 0, there's 00, cannot connect two 1s, otherwise, could
    so set pre = 0 or curLen, and at last try to update max with cur + pre + 1, try to put that 1 every time
     */

    int FlopBitToWin(int n) {
        int cur = 0, pre = 0, max = 0;
        //Calculate length from end to front
        while (n != 0) {
            if ((n & 1) == 1) cur++;
            else {
                pre = (n & 2) == 0 ? 0 : cur;
                cur = 0;
            }
            max = Math.max(max, pre + cur + 1);
            n >>= 1;
        }
        return max;
    }

}
