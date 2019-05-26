import java.util.Stack;

public class Q155_MinStack {

    private Stack<Integer> data, min;

    /** initialize your data structure here. */
    public Q155_MinStack() {
        data = new Stack<Integer>();
        min = new Stack<Integer>();
    }

    public void push(int x) {
        if (data.empty()) {
            min.push(x);
        } else {
            min.push(Math.min(x, min.peek()));
        }
        data.push(x);
    }

    public void pop() {
        data.pop();
        min.pop();
    }

    public int top() {
        return data.peek();
    }

    public int getMin() {
        return min.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */