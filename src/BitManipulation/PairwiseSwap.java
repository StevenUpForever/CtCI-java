package BitManipulation;

public class PairwiseSwap {
    /*
    Write a program to swap odd and even bits in an integer with as few instructions as
   possible (e.g., bit 0 and bit 1 are swapped, bit 2 and bit 3 are swapped, and so on).
     */

    /*
    use mask 1010101010 and 0101010101 AND x
     */
    int swap(int x) {
        return (x & 0xaaaaaaaa >> 1) | (x & 0x55555555 << 1);
    }

}
