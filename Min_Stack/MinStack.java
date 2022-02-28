package Min_Stack;

import java.util.Stack;

public class MinStack {

    private Stack<Integer> stack = new Stack<>();
    private int min = Integer.MAX_VALUE;

    public void push(int val) {
        stack.push(min);
        stack.push(val);
        min = Math.min(min, val);
    }

    public void pop() {
        stack.pop();
        min = stack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return min;
    }
}
