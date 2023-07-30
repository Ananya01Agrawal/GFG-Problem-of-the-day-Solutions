class Solution
{
    // returns the inorder successor of the Node x in BST (rooted at 'root')
	public Node inorderSuccessor(Node root,Node x)
         {
          //add code here.
          ArrayList<Integer> list = new ArrayList<>();
          list = inorder(root,list);
          for(int i=0;i<list.size()-1;i++){
              if(list.get(i)==x.data){
                 return new Node(list.get(i + 1));
              }
          }
          return null;
         }
         public static  ArrayList<Integer> inorder(Node root,ArrayList<Integer> list){
        if(root == null){
            return list;
        }
        list = inorder(root.left,list);
        list.add(root.data);
        list = inorder(root.right,list);
        return list;
    }
}
