class Solution {
    static int minRepeats(String A, String B) {
        // code here
        int count = B.length()/A.length();
        int ans = 1;
        String str = A;
        for(int i=0;i<=count+1;i++){
            if(str.contains(B)) return ans;
            str += A;
            ans+=1;
        }
        return -1;
    }
};
