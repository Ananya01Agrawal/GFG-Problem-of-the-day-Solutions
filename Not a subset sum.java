class Solution {
    public long findSmallest(int[] arr) {
        // Your code goes here
        long curr=1;
        for(int i:arr){
            if(curr<i) return curr;
            curr+=i;
        }
        return curr;
    }
}
