class Solution {
    public static int kthSmallest(int[] arr, int k) {
        // Your code here
         PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i : arr){
            pq.add(i);
        }
        while(k!=1){
            k--;
            pq.poll();
        }
        return pq.peek();
    }
}
