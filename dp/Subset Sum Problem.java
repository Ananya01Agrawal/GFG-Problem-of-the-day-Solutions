

class Solution {

    public static boolean fun(int arr[],int n,int sum,Boolean dp[][])
    {
        if(sum==0)
        {
            return true;
        }
        if(n==0)
        {
            return false;
        }
        if(dp[n][sum]!=null)
        {
            return dp[n][sum];
        }
        if(arr[n-1]>sum)
        {
            return dp[n][sum]=fun(arr,n-1,sum,dp);
        }
        return dp[n][sum] = fun(arr,n-1,sum,dp) || fun(arr,n-1,sum-arr[n-1],dp);
    }
    static Boolean isSubsetSum(int arr[], int sum) {
        int n=arr.length;
        Boolean dp[][]=new Boolean[n+1][sum+1];
        return fun(arr,n,sum,dp);
        
    }
}
