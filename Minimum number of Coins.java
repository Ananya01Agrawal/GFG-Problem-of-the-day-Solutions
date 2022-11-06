class Solution{
    static List<Integer> minPartition(int N)
    {
         List<Integer> ans = new ArrayList<>();

        int[] rs = { 2000, 500, 200, 100, 50, 20, 10, 5, 2, 1};

        for(int i : rs){

            while( N >= i){

                N -= i;

                ans.add(i);

            }

        }

        return ans;
        
    }
}
