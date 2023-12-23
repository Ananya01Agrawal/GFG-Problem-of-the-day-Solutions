class Solution 
{
    //Function to find all elements in array that appear more than n/k times.
    public int countOccurence(int[] arr, int n, int k) 
    {
        // your code here,return the answer
        int count=0;
        Arrays.sort(arr);
        int threshold=n/k;

        for (int i=0;i<n;i++) {
            int currentCount = 1;
            while(i<n-1 && arr[i]==arr[i+1]){
                currentCount++;
                i++;
            }
            if(currentCount>threshold){
                count++;
            }
        }
        return count;
    }
}
