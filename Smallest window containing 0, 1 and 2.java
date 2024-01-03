class Solution {
    public int smallestSubstring(String S) {
        // take three indices and assign to iy yo -1
        int zero=-1, one=-1, two=-1;
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<S.length();i++){
            if(S.charAt(i)=='0'){
                zero=i;
            }
            else if(S.charAt(i)=='1'){
                one=i;
            }
            else{
                two=i;
            }
             if(zero != -1 && one != -1 && two != -1){
                ans=Math.min(ans,i+1-Math.min(zero,Math.min(one,two)));
            }
        }
        if(ans==Integer.MAX_VALUE){
            return -1;
        }
        else{
            return ans;
        }
    }
};
