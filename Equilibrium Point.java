
class Solution {

    
    // a: input array
    // n: size of array
    // Function to find equilibrium point in the array.
    public static int equilibriumPoint(long a[], int n) {
         int sum1=0;
       int sum2 = 0;
       int i =0;
       int j = n-1;
       while(i<j){
           if(sum1<=sum2){
               sum1 +=a[i]; 
               i++;
           }
           else{
               sum2 +=a[j];
               j--;
           }
       }
       if(sum1==sum2){
           return i+1;
       }
       else{
           return -1;
       }
   }

        // Your code here
    
}
