class Tree
{
    
    //Function to check whether a binary tree is balanced or not.
    boolean isBalanced(Node root)
    {
	// Your code here
	if(root==null)
	return true;
	
	int l=Height(root.left);
	int r=Height(root.right);
	
	if(Math.abs(l-r)>1)
	return false;
	
	return isBalanced(root.left) && isBalanced(root.right);
    }
    
    int Height(Node root){
        if(root==null)
        return 0;
        
        return Math.max(Height(root.left),Height(root.right))+1;
    }
}

