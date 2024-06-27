class Solution {
    /*You are required to complete this method*/
    boolean isToeplitz(int mat[][]) {
        int row = mat.length;
        int col = mat[0].length;
        
        for(int i=0; i < row - 1; i++) {
            for(int j = 0; j < col - 1; j++) {
                if(mat[i][j] != mat[i + 1] [j + 1]) {
                    return false;
                }
            }
        }
        return true; 

 
        // Your code here
    }
}
