class Solution {
    int[] Series(int n) {
        // code here
        int mod=1000000007;
        int ans[]=new int[n+1];
         ans[0]=0;
         ans[1]=1;
        for(int i=2;i<=n;i++){
            ans[i]=(ans[i-1]+ans[i-2])%mod;
        }
        return ans;
    }
}
