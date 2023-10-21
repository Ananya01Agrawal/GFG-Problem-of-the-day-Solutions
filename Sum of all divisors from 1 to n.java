class Solution{
    static long sumOfDivisors(int N){
        // code here
        if(N<=0) return 0;
        long sum=0;
        for(int i=1;i<=N;i++){
            sum+=i*(N/i);
        }
        return sum;
    }
}
