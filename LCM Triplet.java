class Solution {
    long lcmTriplets(long N) {
        if(N<3){ 
            return N; }
        else if(N%2 == 0){
            if(N%3 == 0){ 
                return (N-1)*(N-2)*(N-3); }
            else{  
                return N*(N-1)*(N-3); }
        }
        else{
            return N*(N-1)*(N-2);
        }
    }
}
        
