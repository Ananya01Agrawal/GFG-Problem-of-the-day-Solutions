

class Solution {
   Stack<Integer> st = new Stack<>();
    Stack<Integer> minStack = new Stack<>();

    public Solution() {}

    public void push(int x) {
        st.push(x);
        if (minStack.isEmpty() || x <= minStack.peek()) {
            minStack.push(x);
        }
    }

    public void pop() {
        if (!st.isEmpty()) {
            int removed = st.pop();
            if (removed == minStack.peek()) {
                minStack.pop();
            }
        }
    }

    public int peek() {
        if (st.isEmpty()) {
            return -1;
        }
        return st.peek();
    }

    public int getMin() {
        if (minStack.isEmpty()) {
            return -1;
        }
        return minStack.peek();
    }
}
