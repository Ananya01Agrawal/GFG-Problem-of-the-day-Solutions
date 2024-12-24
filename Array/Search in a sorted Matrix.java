



class Solution {
    // Function to search a given number in row-column sorted matrix.
    public boolean searchMatrix(int[][] mat, int x) {
        // code here
        int n=mat.length;
        int m=mat[0].length;
        int row=0;
        int col=m-1;
        while(row<n && col>=0){
            if(mat[row][col]>x){
                col--;
            }
            else if(mat[row][col]<x){
                row++;
            }
            else{
                return true;
            }
        }
        return false;

    }
}
