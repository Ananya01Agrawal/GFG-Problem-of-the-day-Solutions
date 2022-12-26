class Solution{
    
    void precompute(){
        // Code Here
    }
    long solve(long l, long r){
        // Code here
        long ans=0;
        for(int i=0;i<64;i++)
        {
            for(int j=i+1;j<64;j++)
            {
                for(int k=j+1;k<64;k++)
                {
                    long n=(long)Math.pow(2,k)+(long)Math.pow(2,j)+(long)Math.pow(2,i);
                    if(l<=n && n<=r)
                    {
                        //System.out.println(n);
                        ans++;
                    }
                    
                }
            }
        }
        return ans;
    }
}
 
