class Solution
{
    public int firstElementKTime(int n, int k, int[] a) {
        HashMap<Integer,Integer>mp=new HashMap<>();
        for(int i=0;i<n;i++){
            mp.put(a[i],mp.getOrDefault(a[i],0)+1);
            if(mp.get(a[i])==k) return a[i];
            
        }
        return -1;
    } 
}
