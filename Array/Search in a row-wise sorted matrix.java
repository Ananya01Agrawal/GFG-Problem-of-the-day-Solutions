



class Solution {
    // Function to search a given number in row-column sorted matrix.
    public boolean searchRowMatrix(int[][] mat, int x) {
         int r,c;
        
        r=mat.length;
        c=mat[0].length;
        
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                if(mat[i][j]==x)
                {
                    return true;
                }
            }
        }
        
        return false;
    }
}
