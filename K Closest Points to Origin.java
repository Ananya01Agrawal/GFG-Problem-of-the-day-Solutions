class Solution {
    public int[][] kClosest(int[][] points, int k) {
        // Your code here
         int ans[][] = new int[k][2];
        PriorityQueue<Pair>pq = new PriorityQueue<>((a,b)->a.sq-b.sq);
        for(int p[]:points){
            int sq = p[0]*p[0]+p[1]*p[1];
            Pair pr = new Pair(sq,p);
            pq.offer(pr);
        }
        while(k-- !=0){
            ans[k] = pq.poll().pt;
        }
        return ans;
    }
}
class Pair{
    int sq;
    int pt[];
    Pair(int sq,int pt[]){
        this.sq = sq;
        this.pt = pt;
    }
}
