class Solution {
    public long subarrayXor(int arr[], int k) {
          HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int xor = 0;
        int ans = 0;
        for(int i : arr){
            xor ^= i;
            if(map.containsKey(xor^k)){
                ans += map.get(xor^k);
            }
            map.put(xor, map.getOrDefault(xor, 0)+1);
        }
        return ans;
    }
}
