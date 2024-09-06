class Solution {

    // arr: input array
    // Function to find the sum of contiguous subarray with maximum sum.
    long maxSubarraySum(int[] arr) {
        int n=arr.length;
         long currSum=0,maxSum=arr[0];
        for(int i=0;i<n;i++){
            currSum+=arr[i];
            if(maxSum<currSum){
                maxSum=currSum;
            }
            if(currSum<0){
                currSum=0;
            }
        }
        return maxSum;

        // Your code here
    }
}
