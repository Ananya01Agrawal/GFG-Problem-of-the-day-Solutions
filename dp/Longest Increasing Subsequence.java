

class Solution {
    static int lis(int arr[]) {
        // code here
        int n = arr.length;
        int[] dp = new int[n];
        if(n==0)
        {
            return 0;
        }
       for(int i=0;i<n;i++)
        {
            dp[i] = 1;
        }
        for(int i=1;i<n;i++)
        {
            for(int j=0;j<i;j++)
            {
                if(arr[j]<arr[i])
            {
            dp[i] = Math.max(dp[i],dp[j]+1);
            }
            }
        }
       int maxlin = 0;
       for(int i=0;i<n;i++)
       {
           maxlin = Math.max(maxlin,dp[i]);
       }
       return maxlin;
    }
}
