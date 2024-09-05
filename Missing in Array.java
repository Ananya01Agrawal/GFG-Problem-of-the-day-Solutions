class Solution {
   int MissingNumber(int array[], int n) {
       int sum=0;
       for(int a:array){
           sum+=a;
       }
       int sum1=((n)*(n+1))/2;
       return sum1-sum;
   }
}
