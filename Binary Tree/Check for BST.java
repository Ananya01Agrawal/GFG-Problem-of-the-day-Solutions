

// User function Template for Java



// User function Template for Java

class Solution {
    // Function to check whether a Binary Tree is BST or not.
    boolean isBST(Node root) {
        ArrayList<Integer> arr=new ArrayList<>();
        check(root,arr);
        for(int i=1;i<arr.size();i++){
            if(arr.get(i)<=arr.get(i-1)){
                return false;
            }
        }
       return true;
    }
    public static  void check(Node root, ArrayList<Integer>arr){
        if(root==null){
            return ;
        }
        check(root.left, arr);
        arr.add(root.data);
        check(root.right,arr);
    }
}
