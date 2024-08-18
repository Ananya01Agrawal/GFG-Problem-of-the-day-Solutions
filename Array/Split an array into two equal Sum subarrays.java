class Solution {
    public boolean canSplit(int arr[]) {
        int right=arr.length-1;
        int left=0;
        
        int leftSum=0;
        int rightSum=0;
        
        while(left<=right){
            if(leftSum>=rightSum){
                rightSum+=arr[right];
                right--;
            }
            else{
                leftSum+=arr[left];
                left++;
            }
        }
        if(leftSum==rightSum) return true;
        else return false;
    }
}
