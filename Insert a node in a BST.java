class Solution {
    // Function to insert a node in a BST.
    Node insert(Node root, int Key) {
        // your code here
        if(root==null){
            return new Node(Key);
        }
        if(root.data==Key){
            return root;
        }
        if(root.data<Key){
            root.right=insert(root.right,Key);
        }
        else{
            root.left=insert(root.left,Key);
        }
        return root;
    }
}
