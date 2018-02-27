package recursion_dp;

public class RecursiveMultiply {

    /*
    Write a recursive function to multiply two positive integers without using the *operator.You can use addition, subtraction, and bit shifting, but you should minimize the number of those operations.
     */

    int recursiveMultiply(int m, int n) {
        if (n == 0) return 0;
        if (n == 1) return m;
        int half = recursiveMultiply(m, n/2);
        return n % 2 == 0 ? half + half : half + half + n;
    }

}
