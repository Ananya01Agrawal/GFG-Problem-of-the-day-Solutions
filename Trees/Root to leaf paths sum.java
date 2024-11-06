class Solution {
    public static int treePathsSum(Node root) {
        // add code here.
        return solve(root, 0);
    }
    public static int solve(Node root, int val)
    {
        if(root==null)
            return 0;
        if(root.left== null && root.right == null)
            return (val*10) + root.data;
        return solve(root.left, (val*10) + root.data) + solve(root.right, (val*10) + root.data);
    }
}
