

class Solution {

    // Function to return length of longest subsequence of consecutive integers.
    public int longestConsecutive(int[] arr) {
        // code here
             // code here
        int res=1;
        int current=1;
        if(arr.length==0) return 0;
        Arrays.sort(arr);
        for (int i=1;i<arr.length;i++){
            if(arr[i]==arr[i-1]){
               continue;
            }
            if(arr[i]==arr[i-1]+1){
                current++;
            }else{
                res = Math.max(res,current);
                current=1;
            }
        }
        res = Math.max(res,current);
        return res;
    }
}
