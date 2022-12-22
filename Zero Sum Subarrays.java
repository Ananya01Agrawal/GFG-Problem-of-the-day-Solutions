class Solution{
    //Function to count subarrays with sum equal to 0.
    public static long findSubarray(long[] arr ,int n) 
    {
        HashMap<Long,Long> map=new HashMap<>();

      long sum=0;

      long ans=0;

      map.put((long)0,(long)1);

      for(int i=0;i<n;i++){

          sum+=arr[i];

          

          if(map.containsKey(sum)){

              ans+=map.get(sum);

              map.put(sum,map.get(sum)+1);

          }

          else{

              map.put(sum,(long)1);

          }

      }
      return ans;

    }

}
