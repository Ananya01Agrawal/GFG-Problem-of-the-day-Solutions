


/* A Binary Tree node

class Node {
    int data;
    Node left, right;
   Node(int item)    {
        data = item;
        left = right = null;
    }
}
*/
class Solution {
    // Function to return a list containing the inorder traversal of the tree.
     ArrayList<Integer> list=new ArrayList<>();
    ArrayList<Integer> inOrder(Node root) {
        
        addinorder(root);
        return list;
    }
    public void addinorder(Node root){
        if(root==null)
        return;
        addinorder(root.left);
        list.add(root.data);
        addinorder(root.right);
    
    }
}
