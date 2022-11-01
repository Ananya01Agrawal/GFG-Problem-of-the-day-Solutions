class Solution {
    int median(int matrix[][], int R, int C) {
        int[]sol=new int[C*R];
        int x=0;
        for(int i=0;i<R;i++){
            for(int j=0;j<C;j++){
                sol[x]=matrix[i][j];
                x++;
            }
        }
        Arrays.sort(sol);
        return sol[(R*C)/2];
        }
}
