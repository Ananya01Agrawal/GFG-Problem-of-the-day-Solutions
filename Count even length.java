class Solution

{

    int mod = 1000000007;
    public long inv(long r){
        if(r==1) return 1;
        return (mod-((mod/r)*inv(mod%r))%mod+mod)%mod;

    }
    public int  compute_value(int n)
    {

        long ans=1,ncr=1;
        for(int i=1; i<=n; i++){
            ncr=((ncr*(n+1-i)%mod)*inv(i))%mod;
            ans=(ans+(ncr*ncr)%mod)%mod;
            
        }
        return (int)(ans%mod);

    }

}
