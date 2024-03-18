class Solution
{
    //Function to return the level order traversal of a tree.
    static ArrayList <Integer> levelOrder(Node root) 
    {
        ArrayList<Integer> ans= new ArrayList<>();
        Queue<Node> q= new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            Node cu= q.poll();
            ans.add(cu.data);
            if(cu.left!=null)q.offer(cu.left);
            if(cu.right!=null)q.offer(cu.right);
        }
        return ans;
    }
}

