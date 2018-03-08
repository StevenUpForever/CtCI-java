package stacks_queues;

import java.util.Stack;

public class SortStack {

    /*
     * Write a program to sort a stack such that the smallest items are on the top.
     * You can use an additional temporary stack, but you may not copy the elements into any other
     * data structure (such as an array). The stack supports the following operations: push, pop, peek, and isEmpty.
     */

    public Stack<Integer> sortStack(Stack<Integer> stack) {
        Stack<Integer> stack2 = new Stack<>();
        while (!stack.isEmpty()) {
            Integer pop = stack.pop();
            while (!stack2.isEmpty() && stack.peek() > pop) {
                stack.push(stack2.pop());
            }
            stack2.push(pop);
        }
        return stack2;
    }

}
