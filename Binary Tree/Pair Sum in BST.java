

/*
class Node {
    int data;
    Node left, right;

    public Node(int d) {
        data = d;
        left = right = null;
    }
}
*/
class Solution {
    private HashMap<Integer,Integer>map=new HashMap<>();
    public boolean inorder(Node root,int k){
        if(root==null){
            return false;
        }
        boolean left=inorder(root.left,k);
        if(map.containsKey(k-root.data)){
            return true;
        }
        map.put(root.data,map.getOrDefault(root.data,0)+1);
        boolean right=inorder(root.right,k);
        return left || right;
    }
    boolean findTarget(Node root, int target) {
        map.clear();
        boolean ans=inorder(root,target);
        return ans;
    }
}
