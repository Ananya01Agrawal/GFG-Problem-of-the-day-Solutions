class Solution {
    
    public boolean countSub(long arr[], long n)
    {
        // Your code goes here
        for(int i=0;i<(int)n;i++){
            if(i*2+1 <(int)n)
                if(arr[i]<arr[i*2+1]) return false;
            
            if(i*2+2 <(int)n)
                if(arr[i]<arr[i*2+2]) return false;
        }
        return true;
    }
}
