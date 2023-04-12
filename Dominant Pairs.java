class Solution {
    public static int dominantPairs(int n, int[] arr) {
        int dominantPairsCount = 0;
    
    // Sort the first half of the array in non-decreasing order
    Arrays.sort(arr, 0, n/2); 
    
    // Sort the second half of the array in non-increasing order
    Arrays.sort(arr, n/2, n); 
    
    // Initialize two pointers, i and j, to the first element of their respective halves
    int i = 0, j = n/2;
    
    // Iterate over both halves of the array simultaneously using two pointers
    while (i < n/2 && j < n) {
        // Check if the current pair satisfies the condition for dominance
        if (arr[i] >= 5 * arr[j]) {
            /*If yes, increment the dominantPairsCount by the number of elements 
            remaining in the second half*/
            dominantPairsCount += n/2 - i;
            // Move to the next element in the second half
            j++;
        } else {
            // If no, move to the next element in the first half
            i++;
        }
    }
    
    // Return the count of dominant pairs
    return dominantPairsCount;
    }
}
