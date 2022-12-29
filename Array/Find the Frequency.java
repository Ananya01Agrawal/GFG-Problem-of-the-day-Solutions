class Solution{
    int findFrequency(int A[], int x){
        int count=0;
        for(int i=0;i<A.length;i++){
            if(A[i]==x) count++;
        }
        return count;
        
    }
}
