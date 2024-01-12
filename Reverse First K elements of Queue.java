class GfG {
    // Function to reverse first k elements of a queue.
    public Queue<Integer> modifyQueue(Queue<Integer> q, int k) {
        Queue<Integer> queue = new LinkedList<Integer>();
        ArrayList<Integer> al = new ArrayList<>();
        int i=0;
        int count=0;
        while(count!=k){
            al.add(q.peek());
            q.remove();
            count++;
        }
        
        Collections.reverse(al);
        while(!q.isEmpty()) {
            al.add(q.peek());
            q.remove();
        }
        
        for(i=0;i<al.size();i++){
            queue.add(al.get(i));
        }
        return queue;
    }
}
