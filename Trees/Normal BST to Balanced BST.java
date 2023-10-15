class GfG
{
    void solve(Node root,ArrayList<Integer> arr){
        if(root==null)
        return;
        solve(root.left,arr);
        arr.add(root.data);
        solve(root.right,arr);
    }
    Node bst(ArrayList<Integer> arr, int low, int high){
        if(low>high)
        return null;
        
        int mid=(low+high)/2;
        Node p=new Node(arr.get(mid));
        p.left=bst(arr,low,mid-1);
        p.right=bst(arr,mid+1,high);
        return p;
        
    }
    Node buildBalancedTree(Node root) 
    {
        //Add your code here.
        ArrayList<Integer> arr=new ArrayList<>();
        solve(root,arr);
        int n=arr.size();
        
       return bst(arr,0,n-1);
    }
}
