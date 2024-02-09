class Solution
{
    //Function to check whether all nodes of a tree have the value 
    //equal to the sum of their child nodes.
    public static int isSumProperty(Node root)
    {
        return check(root);
        
    }
    public static int check(Node root){
        if(root==null)
            return 1;
        int sum=0;
        if(root.left!=null)
            sum+=root.left.data;
        if(root.right!=null)
            sum+=root.right.data;
        if((root.left!=null || root.right!=null)&& sum!=root.data){
            return 0;
        }
        return check(root.left)& check(root.right);
    }
}
