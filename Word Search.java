

class Solution
{
    public boolean isWordExist(char[][] mat, String word)
    {
         int m=mat.length;
        int n=mat[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(mat[i][j]==word.charAt(0)){
                    if(dfs(mat,word,0,i,j)){
                        return true;
                    }
                }
            }
        }
        return false;
    }
    static boolean dfs(char[][] mat,String word, int idx,int i,int j){
        if(idx>=word.length()){
            return true;
        }
        if(i<0||j<0||i>=mat.length||j>=mat[0].length||
        mat[i][j]!=word.charAt(idx)){
            return false;
        }
        char temp=mat[i][j];
        mat[i][j]='#';
        boolean res=dfs(mat,word,idx+1,i+1,j)||
                    dfs(mat,word,idx+1,i-1,j)||
                    dfs(mat,word,idx+1,i,j+1)||
                    dfs(mat,word,idx+1,i,j-1);
        mat[i][j]=temp;
      return res;
    }
                    
}
