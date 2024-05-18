class Solution {
    public static int findClosest(int n, int k, int[] arr) {
        int min_diff=Integer.MAX_VALUE, ans=0;
        
        int l=0, r=n-1;
        
        while(l<=r){
            int mid = l+(r-l/2);
            
            int cur_diff = Math.abs(arr[mid]-k);
            
            if(cur_diff<min_diff){
                min_diff = cur_diff;
                ans = arr[mid];
            }
            
            if(k==arr[mid]){
                break;
            }else if(arr[mid]<k){
                l=mid+1;
            }else{
                r=mid-1;
            }
        }
        
        return ans;
    }
}
        
