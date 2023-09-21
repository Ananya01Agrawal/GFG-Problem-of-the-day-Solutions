class Solution
{
    //Function to find the maximum money the thief can get.
    public int FindMaxSum(int houses[], int n)
    {
        // Your code here
        //{6,5,5,7,4}
        //maxamount==6 11 13
        //prevamount=0 6 11
        //curramount=6 11 13
        
        if (n == 0) 
            return 0;
            
        int prevMax = 0,currMax = 0;

        for (int i = 0; i < n; i++) {
            int maxAmount = Math.max(currMax, prevMax + houses[i]);
            prevMax = currMax;
            currMax = maxAmount;
        }

        return currMax;
    }
}
