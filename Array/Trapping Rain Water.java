

class Solution {
    public int maxWater(int arr[]) {
        // code here
         int n = arr.length;
        int left[] = new int[n];
        left[0]=arr[0];
        int right[] = new int[n];
        right[n-1]=arr[n-1];
        for(int i=1;i<n;i++){
            left[i] = Math.max(arr[i],left[i-1]);
            right[n-i-1] = Math.max(arr[n-i-1],right[n-i]);
        }
        int ans = 0;
        for(int i=0;i<n;i++){
            ans = ans + Math.min(left[i],right[i]) - arr[i];
        }
        return ans;
    }
}
