class Solution
{
    // return the Kth largest element in the given BST rooted at 'root'
    public int kthLargest(Node root,int K)
    {
        //Your code here
        ArrayList<Integer> list=new ArrayList<>();
        inorderTraversal(root,list);
        return list.get(list.size()-K);
    }
    public void inorderTraversal(Node current, ArrayList<Integer>list){
        if(current!=null){
            inorderTraversal(current.left,list);
            list.add(current.data);
            inorderTraversal(current.right,list);
        }
    }
}
