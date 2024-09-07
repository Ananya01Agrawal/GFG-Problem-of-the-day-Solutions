class Solution {
    long findNth(long n) {
        // code here
        String res = "";
        while(n>0){
            res = (n%9) + res;
            n/=9;
        }
        return Long.valueOf(res);
    }
}
