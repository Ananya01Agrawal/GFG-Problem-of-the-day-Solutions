class Solution {
    public boolean compute(Node root) {
        StringBuilder sb=new StringBuilder();
        while(root!=null){
            sb.append(root.data);
            root=root.next;
        } 
        return sb.toString().equals(sb.reverse().toString());
    }
}
