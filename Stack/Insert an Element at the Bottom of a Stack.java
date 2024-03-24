class Solution {
    public Stack<Integer> insertAtBottom(Stack<Integer> st, int x) {
        Stack<Integer> ans=new Stack<>();
        while(st.size()>0){
            ans.push(st.pop());
        }
        st.push(x);
        
        while(ans.size()>0){
            st.push(ans.pop());
        }
        return st;
    }
}
