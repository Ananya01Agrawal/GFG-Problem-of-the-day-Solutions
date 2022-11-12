class Solution {
    static long squaresInMatrix(int m, int n) {
        long count = 0;
       int min = (int)Math.min(m,n);
       int i=1;
       while(i<=min){
           count += (n-i+1)*(m-i+1);
           i++;
       }
       return count;
   }
}
