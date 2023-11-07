class Solution
{
    //Function to return sum of upper and lower triangles of a matrix.
    static ArrayList<Integer> sumTriangles(int matrix[][], int n)
    {
         ArrayList<Integer> answer = new ArrayList<>();
        int lower = 0,upper=0;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                lower+=matrix[i][j];
            }
            for(int j=0;j<=i;j++){
                upper+=matrix[i][j];
            }
        }
        answer.add(lower);answer.add(upper);
        return answer;
    }
}
