class Solution {
    void pushZerosToEnd(int[] arr, int n) {
        // code here
        int left = 0;
        int right = 0;
        while(right < n){
            if( arr[right] != 0){
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                // right++;
                left++;
            }
            right++;
        }
    }
}
