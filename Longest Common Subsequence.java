class Solution
{
    //Function to find the length of longest common subsequence in two strings.
    static int lcs(int x, int y, String s1, String s2)
    {
        // your code here
        int dp[][]=new int[x+1][y+1];
        
        for (int i=x-1;i>=0;i--){
            for (int j=y-1;j>=0;j--){
                    if( s1.charAt(i)==s2.charAt(j) )
                    dp[i][j] = 1 + dp[i+1][j+1];
                    else
                    dp[i][j]= Math.max( dp[i][j+1] , dp[i+1][j] );
            }
        }
        
        
        return dp[0][0];
        
        
    }
    
    
}
