


class Solution {
    // Function to find the smallest positive number missing from the array.
    public int missingNumber(int[] arr) {
        // Your code here
          int n = arr.length;
        HashSet<Integer> set = new HashSet<>();
        
        // Add all elements to the set
        for (int num : arr) {
            if (num > 0) {
                set.add(num); // Only positive numbers matter
            }
        }
        
        // Check for the smallest missing positive number
        for (int i = 1; i <= n + 1; i++) { 
            if (!set.contains(i)) {
                return i; 
            }
        }
        
        // This point will not be reached
        return n + 1;
    }
}
