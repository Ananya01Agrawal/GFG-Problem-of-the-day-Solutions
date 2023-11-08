class Solution
{
    //Function to return list of integers visited in snake pattern in matrix.
    static ArrayList<Integer> snakePattern(int matrix[][])
    {
        // code here 
        int left=0;
        int right=matrix.length;
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<matrix.length;i++){
            if(i%2==0){
                for(int j=left;j<right;j++){
                    list.add(matrix[i][j]);
                }
            }
            else{
                for(int j=right-1;j>=left;j--){
                    list.add(matrix[i][j]);
                }
            }
        }
        return list;
    }
}
