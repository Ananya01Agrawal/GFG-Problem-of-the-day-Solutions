

// User function Template for Java
class Solution {
    public int getMinDiff(int k, int[] arr) {
        // code here
         Arrays.sort(arr);
        int n=arr.length;
        int ans=arr[n-1]-arr[0];
        for(int i=0;i<arr.length-1;i++)
        {
            int Max=Math.max(arr[n-1]-k, arr[i]+k);
            int Min=Math.min(arr[i+1]-k, arr[0]+k);
            ans=Math.min(ans, Max-Min);
        }
        return ans;
    }
}
