class Solution {
    public boolean checkDuplicatesWithinK(int[] arr, int k) {
        // your code
          HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            // Check if element is already in set
            if (set.contains(arr[i])) {
                return true; // Duplicate found within k distance
            }

            // Add the current element to the set
            set.add(arr[i]);

            // Maintain the size of the set to be at most k
            if (i >= k) {
                set.remove(arr[i - k]); // Remove the element that's outside the k-distance window
            }
        }
        return false;
    }
}
