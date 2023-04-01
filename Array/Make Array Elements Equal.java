class Solution {
    public long minOperations(int N) {
        // Code here
        if(N%2==0){
            return (long)(((long)N/2)*((long)N/2));
            
        }
        else{
            long n=((long)N/2);
            return(n+1)*n;
        }
    }
}
