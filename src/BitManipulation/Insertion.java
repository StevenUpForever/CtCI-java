package BitManipulation;

public class Insertion {

    /*
    You are given two 32-bit numbers, N and M, and two bit positions, i and j. Write a method to insert M into N such that M starts at bit j and ends at bit i. You can assume that the bits j through i have enough space to  t all of M. That is, if M = 10011, you can assume that there are at least 5 bits between j and i. You would not,  r example, have j = 3 and i = 2, because M could not fully  t between bit 3 and bit 2.
    EXAMPLE
Input: N 10000000000, M 10011, i 2, j 6 Output:N = 10001001100
     */

    /*
    1. clean bit of n from i to j to 1
    2. shift m by i bits
    3. AND n and m
     */

    int insertion(int n, int m, int i, int j) {
        int bit = 1 << i;
        for (int num = i; num <= j; num++) {
            n |= bit;
            bit <<= 1;
        }
        return n & (m << i);
    }




}
