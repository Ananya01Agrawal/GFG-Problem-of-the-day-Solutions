

class Solution {
    public int maxLen(int[] arr) {
        // Your code here
         int count = 0;
        int o = 0;
        // Create a HashMap to store the first occurrence of a given count
        Map<Integer, Integer> map = new HashMap<>();
        // Initialize with 0, because an equal number of 0's and 1's can start from the beginning
        map.put(0, -1);
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                o++;
            } else {
                o--;
            }
            
            // If the count has been seen before, calculate the length of the subarray
            if (map.containsKey(o)) {
                count = Math.max(count, i - map.get(o));
            } else {
                // Otherwise, store the first occurrence of the count
                map.put(o, i);
            }
        }
        return count;
    }
}
