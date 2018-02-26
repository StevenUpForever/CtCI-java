package stacks_queues;

import java.util.Stack;

public class QueueViaStacks {

    /*
    Implement a MyQueue class which implements a queue using two stacks.
     */

    class MyQueue {

        Stack stack1;
        Stack stack2;

        public MyQueue() {
            stack1 = new Stack();
            stack2 = new Stack();
        }

        public void push(Object object) {
            stack1.push(object);
        }

        public Object pop() {
            if (stack2.isEmpty()) {
                while (!stack1.isEmpty())
                    stack2.push(stack1.pop());
            }
            return stack2.pop();
        }

        public int size() {
            return stack1.size() + stack2.size();
        }

        public boolean isEmpty() {
            return stack1.isEmpty() && stack2.isEmpty();
        }

    }

}
