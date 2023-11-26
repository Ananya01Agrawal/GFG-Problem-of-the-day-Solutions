class Solution{
    public List<Integer> pattern(int N){
         ArrayList<Integer> ans=new ArrayList<>();
        int temp=N;
        ans.add(temp);
        while(N>0)
        {
            ans.add(N-5);
            N-=5;
        }
        while(temp!=N)
        {
            ans.add(N+5);
            N+=5;
        }
        return ans;
    }
}
