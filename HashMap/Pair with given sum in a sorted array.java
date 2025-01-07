// User function Template for Java

class Solution {

    int countPairs(int arr[], int target) {
        int count=0;
        Map<Integer,Integer>mp=new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            if(mp.containsKey(target-(arr[i])))
            {
                count+=mp.get(target-arr[i]);
            }
            if(mp.containsKey(arr[i]))
            mp.put(arr[i],mp.get(arr[i])+1);
            else
            {
                mp.put(arr[i],1);
            }
        }
        return count;
    }
}
        
