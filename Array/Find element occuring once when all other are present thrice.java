class Solution {
    static int singleElement(int[] arr , int N) {
        // code here
        int ans=-1;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<N;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        for(int i:map.keySet()){
            if(map.get(i)==1)
            ans=i;
        }
        return ans;
    }
}
