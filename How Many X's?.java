class Solution {
    int countX(int L, int R, int X) {
        // code here
        int count=0;
        
        for(int i=L+1;i<R;i++){
            int num=i;
            while(num>0){
                int digit=num%10;
                if(digit==X){
                    count++;
                }
                num/=10;
            }
            
        }
        return count;
    }
};
