

// User function Template for Java

class Solution {

    public int maxWater(int arr[]) {
        // Code Here
        int len=arr.length;
        int i=0,j=len-1;
        int mxA = 0;
        while(i<j){
            mxA = Math.max(Math.min(arr[i],arr[j]) * (j-i),mxA);
            if(arr[i]<arr[j])
            i++;
            else if(arr[j]<arr[i])
            j--;
            else{
                i++;j--;
            }
        }
        return mxA;
    }
}
