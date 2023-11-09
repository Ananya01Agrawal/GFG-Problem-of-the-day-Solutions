class Solution
{
    int columnWithMaxZeros(int arr[][], int N)
    {
        // code here 
        int res=-1;
        int max=0;
        for(int j=0;j<N;j++){
            int cnt=0;
            for(int i=0;i<N;i++){
                if(arr[i][j]==0){
                    cnt++;
                }
            }
            if(cnt>max){
                max=cnt;
                res=j;
            }
        }
        return res;
    }
}
