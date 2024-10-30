class Solution {
    int countPairsWithDiffK(int[] arr, int k) {
        // code here
         Map<Integer,Integer> map = new HashMap<>();
        int count = 0;

        for (int num : arr) {
            count += map.getOrDefault(num - k, 0);
            count += map.getOrDefault(num + k, 0);
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        return count;
    }
}
