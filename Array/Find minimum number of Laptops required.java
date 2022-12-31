class Solution {
    public int minLaptops(int N, int[] start, int[] end) {
        Arrays.sort(start);
        Arrays.sort(end);
        int ans=1,i=0,j=0,c=0;
        while(i<start.length && j<end.length){
            if(start[i]<end[j]){
                i++;
                c++;
            }else{
                j++;
                c--;
            }
            ans=Math.max(ans,c);
        }
        return ans;
    }
}
