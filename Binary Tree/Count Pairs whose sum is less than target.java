class Solution {
    int countPairs(int a[], int target) {
        // Your code here
         Arrays.sort(a);
        int count = 0;
        int low = 0;
        int high = a.length-1;
        while(low < high){
            int sum = a[low] + a[high];
            if(sum < target){
                count += high - low;
                low++;
            }
            else{
                high--;
            }
        }
        return count;
    }
}
