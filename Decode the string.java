


class Solution {
    static String decodeString(String s) {
        // code here
        StringBuilder sb=new StringBuilder("");
        Stack<StringBuilder> st=new Stack<>();
        Stack<Integer> cnt=new Stack<>();
        int i=0;
        while(i<s.length()){
            char ch=s.charAt(i);
            if(Character.isDigit(ch)){
                int count=0;
                while(Character.isDigit(s.charAt(i))){
                    count=count*10+(s.charAt(i)-'0');
                    i++;
                }
                cnt.push(count);
            }
            else if(ch=='['){
              st.push(sb);
              sb=new StringBuilder("");
              i++;
            }
           else if(ch==']'){
                StringBuilder prev=st.pop();
                int n=cnt.pop();
                for(int j=0; j<n; j++){
                    prev.append(sb);
                }
                sb=prev;
                i++;
               
            }
            else{
                sb.append(ch);
                i++;
            }
        }
        return sb.toString();
    }
}
