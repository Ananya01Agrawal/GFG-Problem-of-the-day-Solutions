class Solution {
    static int ans = Integer.MIN_VALUE;
    public static int findAns(Node root){
        if(root==null) return 0;
        int a = findAns(root.left);
        int b = findAns(root.right);
        ans=  Math.max(root.data + a+ b, ans);
        return root.data+a+b;
    }
    public static int findLargestSubtreeSum(Node root) {
        // code here
        ans=Integer.MIN_VALUE;
        findAns(root);
        return ans;
    }
}
