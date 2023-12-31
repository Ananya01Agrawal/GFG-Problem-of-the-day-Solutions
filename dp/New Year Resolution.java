class Solution {
    static boolean solve(int[] coins,int n,int i,int sum,Boolean[][] dp)
    {
        if((sum > 0) && (sum % 20 == 0 || sum % 24 == 0 || sum == 2024)) 
        {
            return true;
        }
        if(i>=n)
        {
            return false;
        }
        if(dp[i][sum]!=null)
        {
            return dp[i][sum];
        }
        boolean ch1 = solve(coins,n,i+1,sum+coins[i],dp);
        boolean ch2 = solve(coins,n,i+1,sum,dp);
        return dp[i][sum] = ch1||ch2;
    }
    public static boolean isPossible(int n, int[] coins) {
        // code here
        Boolean[][] dp = new Boolean[n][2024];
        return solve(coins,n,0,0,dp);
    }
}


        
