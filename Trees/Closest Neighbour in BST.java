class Solution {
    public static int findMaxForN(Node root, int n) {
        // Add your code here.
        int maxi=-1;
        while(root!=null){
            if(root.key<=n){
                maxi=root.key;
                root=root.right;
            }
            else{
                root=root.left;
            }
        }
        return maxi;
    }
}
