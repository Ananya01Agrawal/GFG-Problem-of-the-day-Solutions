class Solution
{
    public int longestPalinSubseq(String S)
    {
        //code here
         int n = S.length();
        int dp[][] = new int[n][n];


        for (int g = 0; g < n; g++) {
            for (int i = 0, j = g; j < n; i++, j++) {
                if (g == 0) {
                    dp[i][j] = 1;

                } else if (g == 1) {
                   dp[i][j] = S.charAt(i)==S.charAt(j)? 2:1;
                }
                else{
                    if(S.charAt(i)==S.charAt(j))
                    {
                        dp[i][j] = 2 +  dp[i+1][j-1];
                    }
                    else{
                        dp[i][j] =  Math.max(dp[i+1][j], dp[i][j-1]);
                    }
                }
            }
        }
        return dp[0][n-1];

       
    }
}
