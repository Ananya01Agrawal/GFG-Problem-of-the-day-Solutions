class Solution
{
    //Function to check if brackets are balanced or not.
    static boolean ispar(String str)
    {
        // add your code here
        Stack <Character> st=new Stack<>();
        int i=0;
        int n=str.length();
        while(i<n){
            if(str.charAt(i)=='(' || str.charAt(i)=='{'|| str.charAt(i)=='['){
                st.add(str.charAt(i));
            }else {
                char ch=str.charAt(i);
                if(st.size()>0){
                    if(ch==')'){
                        if(st.peek()=='('){
                            st.pop();
                        }else return false;
                    }else if(ch=='}'){
                        if(st.peek()=='{'){
                            st.pop();
                        }else return false;
                        
                    }else {
                        if(st.peek()=='['){
                            st.pop();
                        }else return false;
                        
                    }
                }else {
                    return false;
                }
            }
            i++;
        }
        
        if(st.size()>0)return false;
        else return true;
    }
}
