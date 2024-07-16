class Solution {
    public String printString(String s, char ch, int count) {
        // code here
        int index=-1;
        int num=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==ch){
                num++;
            }
            if(num==count){
                if(i==s.length()-1){
                    return "";
                }
                return s.substring(i+1);
            }
        }
        
        return "";
    }
}
