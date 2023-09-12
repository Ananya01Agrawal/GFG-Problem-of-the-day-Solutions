class Solution {
    static int isPerfectNumber(long N) {
        // code here
        long sum=1;
        for(long i=2;i<=Math.sqrt(N);i++){
            if(N%i==0){
                sum+=i;
            }
        }
        if(sum==1){
            return 0;
        }
        if(N%sum==0){
            return 1;
        }
        return 0;
    }
};
