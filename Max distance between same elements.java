class Solution {
    public int maxDistance(int[] arr) {
        // Code here
        int n=arr.length;
        int ans=0;
        HashMap<Integer,Integer>mpp=new HashMap<>();
        for(int i=0;i<n;i++){
            if(mpp.containsKey(arr[i])){
                ans=Math.max(ans,i-mpp.get(arr[i]));
            }
            else{
                mpp.put(arr[i],i);
            }
        }
        return ans;
    }
}
