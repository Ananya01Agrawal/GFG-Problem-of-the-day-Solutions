class Solution
{
    //Function to find position of first set bit in the given number.
    public static int getFirstSetBit(int n){
            
        // Your code here
        int x=0,count=0;
        while(n>0){
            count++;
            x=n%2;
            if(x==1) return count;
            n=n/2;
        }
        return 0;
            
    }
}
