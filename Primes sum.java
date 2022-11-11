class Solution {
    public static boolean isPrime(int n){
        // code here
        if(n<=1){
            return false;
        }
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    static String isSumOfTwo(int N){
        String y="Yes";
        String n="No";
        for(int i=2;i<N-1;i++){
            if(isPrime(i)&& isPrime(N-i))
            return y;
        }
        return n;
    }
}
