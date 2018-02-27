package bit_manipulation;

public class Debugger {

    /*
    Explain what the following code does: ((n & (n-1)) == 0).
     */

    /*
    checking if n is multiple of 2
    this means if n and n - 1 are all bits different
    when there's one bit is 1, -1 will be 0, and other bits keep the same, if it's 0, need to borrow 1 bit from
    previous bit, then if -1 will be all bit diff, then every bit need to borrow one from previous, which means
    every bit is 0, and there's 1 bit is 1, like 000100000 it's power of 2
    when n is multiple by 2, n will be only one bit of 1, and n - 1 will be all bit of 1 except the nth bit
     */

}
