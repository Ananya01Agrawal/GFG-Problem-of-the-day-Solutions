

// User function Template for Java
/*
class Node
{
    int data;
    Node left, right;

    public Node(int d)
    {
        data = d;
        left = right = null;
    }
}
*/

class Solution {
    
    public boolean isLeaf(Node node ){
        return (node.left ==null && node.right==null);
    }
    public void leftBoundary(ArrayList<Integer> res,Node node){
        Node leftNode = node.left;
        
        while(leftNode !=null){
            if(isLeaf(leftNode)){
                break;
            }
            res.add(leftNode.data);
            if(leftNode.left !=null){
                leftNode = leftNode.left;
            }
            else{
                leftNode = leftNode.right;
            }
        }
    }
    
    
     public void rightBoundary(ArrayList<Integer> res,Node node){
        Node rightNode = node.right;
        Stack<Integer> st = new Stack<>();
        
        while(rightNode !=null){
            if(isLeaf(rightNode)){
                break;
            }
            st.push(rightNode.data);
            if(rightNode.right !=null){
                rightNode = rightNode.right;
            }
            else{
                rightNode = rightNode.left;
            }
        }
        while(st.size()>0){
            res.add(st.pop());
        }
    }
    
    
    public void leafNode(ArrayList<Integer> res,Node node){
        if(node ==null) return;
        
        if(isLeaf(node)){
            res.add(node.data);
        }
         leafNode(res,node.left);
         leafNode(res,node.right);
    }
    
    
    ArrayList<Integer> boundaryTraversal(Node node) {
        // code here
        ArrayList<Integer> res = new ArrayList<>();
        
        //insert root
        if(!isLeaf(node)){
            res.add(node.data);
        }
        //insert leftboundary
        leftBoundary(res,node);
        
        //insert leafnode 
        leafNode(res,node);
        
        //insert rightboundary
        rightBoundary(res,node);
        
        return res;
    }
}
