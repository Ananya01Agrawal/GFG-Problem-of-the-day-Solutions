class Solution {
    public static int pairsum(int[] arr) {
        // code here
        int fmax=arr[0],idx=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>fmax){
                fmax=arr[i];
                idx=i;
            }
        }
        int smax=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(idx!=i) smax=Math.max(smax,arr[i]);
        }
        return fmax+smax;
    }
}
