

class Solution {
    public int countTriplets(int[] arr, int target) {
        // Code Here
        int n=arr.length;
        int count=0;
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int sum=target-(arr[i]+arr[j]);
                count+=map.getOrDefault(sum,0);
            }
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        return count;
    }
}
