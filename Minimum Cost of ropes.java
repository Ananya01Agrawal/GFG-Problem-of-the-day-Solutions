class Solution {
    // Function to return the minimum cost of connecting the ropes.
    public long minCost(long[] arr) {
        // code here
          if (arr.length == 1) {
            return 0;
        }
        
        PriorityQueue<Long> pq = new PriorityQueue<>();
        
        for (long num : arr) {
            pq.offer(num);
        }
        
        long sum = 0;
        
        while (pq.size() > 1) {
            long a = pq.poll();
            long b = pq.poll();
            long curr = a + b;
            sum += curr;
            pq.offer(curr);
        }
        return sum;
    }
}
