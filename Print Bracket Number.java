class Solution {
    ArrayList<Integer> bracketNumbers(String str) {
        // code here
        Stack<Integer> st=new Stack<>();
        ArrayList<Integer> lst=new ArrayList<>();
        int count=1;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='('){
                st.push(count);
                lst.add(count);
                count++;
            }
            if(str.charAt(i)==')'){
                if(!st.isEmpty()){
                    lst.add(st.pop());
                }
            }
        }
        return lst;
    }
};
