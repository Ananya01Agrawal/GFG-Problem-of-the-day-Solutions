class Solution {
    long minimizeSum(int N, int arr[]) {
        // code here
        PriorityQueue<Integer> pq = new PriorityQueue<>(); // MIN HEAP
        for(int i=0;i<N;i++){
           pq.offer(arr[i]); 
        }
        long sum = 0;
        while(pq.size() > 1){
            int a = pq.remove();
            int b = pq.remove();
            sum += (long)a + b;
            pq.offer(a+b);
        }
        return sum;
    }
}
