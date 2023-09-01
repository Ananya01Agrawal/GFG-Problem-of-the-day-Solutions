class Tree
{
    public static void printCorner(Node node)
    {
        if(node == null) return;
        Queue<Node> q = new LinkedList<>();
        q.add(node);// add the elements to the queue
        while(!q.isEmpty())
        {
            int cnt = q.size();//calculate the size of the queue
            for(int i=0; i<cnt; i++)
            {
                Node cur = q.peek();// pop the first element
                q.remove();
                if(i==0 || i == cnt-1)// if our element is the first element and the last element
                {
                    System.out.print(cur.data + " ");
                }
                if(cur.left != null ) q.add(cur.left);
                if(cur.right != null) q.add(cur.right);
            }
        }
    }
    
}

