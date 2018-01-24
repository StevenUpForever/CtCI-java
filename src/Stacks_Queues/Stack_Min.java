package Stacks_Queues;

import java.util.Stack;

public class Stack_Min {

    /*
     How would you design a stack which, in addition to push and pop, has a function min which returns the minimum element? Push, pop and min should all operate in 0(1) time.
     */

    class MinStack {
        private Stack<Integer> stack1;
        private Stack<Integer> stack2;
        public MinStack() {
            stack1 = new Stack<>();
            stack2 = new Stack<>();
        }
        public void push(Integer integer) {
            stack1.push(integer);
            if (stack2.isEmpty() || stack2.peek() > integer)
                stack2.push(integer);
        }

        public Integer pop() {
            Integer pop = stack1.pop();
            if (pop.equals(stack2.peek())) stack2.pop();
            return pop;
        }

        public boolean isEmpty() {
            return stack1.isEmpty();
        }

    }

}
