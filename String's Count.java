class Solution 
{ 
    static long countStr(long n)
	{
	    // code here
	    long ans = 1+(n*2)+(n*((n*n)-1)/2);
        return ans;
	}
} 
