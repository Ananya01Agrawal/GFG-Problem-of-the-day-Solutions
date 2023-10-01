class Solution
{
    //Function to return list of integers that form the boundary 
    //traversal of the matrix in a clockwise manner.
    static ArrayList<Integer> boundaryTraversal(int matrix[][], int n, int m)
    {
        // code here 
        ArrayList<Integer> res=new ArrayList<Integer>();
        if(n==1){// if only single row is there
            for(int i=0;i<m;i++){
                res.add(matrix[0][i]);
                
            }
        }
        else if(m==1){// when only single column is there
            for(int i=0;i<n;i++){
                res.add(matrix[i][0]);
            }
        }
        else{
            for(int i=0;i<m;i++){
                res.add((matrix[0][i]));
            }
            for(int i=1;i<n;i++){
                res.add(matrix[i][m-1]);
            }
            for(int i=m-2;i>=0;i--){
                res.add(matrix[n-1][i]);
            }
            for(int i=n-2;i>=1;i--){
                res.add(matrix[i][0]);
            }
        }
        
        return res;
    }
}
