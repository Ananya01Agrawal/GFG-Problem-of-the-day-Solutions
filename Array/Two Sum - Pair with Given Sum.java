

// User function Template for Java

class Solution {
    boolean twoSum(int arr[], int x) {
        // code here
        int n=arr.length;
         Arrays.sort(arr);
        int i=0;
        int j=n-1;
        while(i<j){
            if(arr[i]+arr[j]==x) return true;
            else if(arr[i]+arr[j]<x) i++;
            else j--;
        }
        return false;
    }
}
