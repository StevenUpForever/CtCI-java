package RecursionDP;

public class RecursiveMultiply {

    /*
    Write a recursive function to multiply two positive integers without using the *operator.You can use addition, subtraction, and bit shifting, but you should minimize the number of those operations.
     */

    int recursiveMultiply(int m, int n) {
        if (n == 0) return 0;
        if (n == 1) return m;
        m = n % 2 == 0 ? m << 1 : m << 1 + n;
        return recursiveMultiply(m, n/2);
    }

}
