package Stacks_Queues;

import java.util.Stack;

public class Sort_Stack {

    public Stack<Integer> sortStack(Stack<Integer> stack) {
        Stack<Integer> stack2 = new Stack<>();
        while (!stack.isEmpty()) {
            Integer pop = stack.pop();
            int count = 0;
            while (!stack2.isEmpty() && stack.peek() > pop) {
                stack.push(stack2.pop());
                count++;
            }
            stack2.push(pop);
            while (count > 0) {
                stack2.push(stack.pop());
            }
        }
        return stack2;
    }

}
