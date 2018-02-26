package stacks_queues;

public class ThreeInOne {

    /**
    Describe how you could use a single array to implement three stacks.
     */

    /**
     * If the stack is fixed size,
     * int size = array.length
     * 1st stack: [0, 1/3 * size]
     * 2nd stack: [1/3 * size, 2/3 * size]
     * 3rd stack: [2/3 * size, size]
     */

    /**
     * If not fixed size,
     * dynamically update every stack size, and update start, end index of each stack
     */


}
