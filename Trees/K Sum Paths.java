

/*
class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}
*/

class Solution {
    public void solve(Node root,int k,HashMap<Integer,Integer>map,int sum,int count[]){
        if(root == null) return;
       
         sum+=root.data; 
        if(map.containsKey(sum-k)){
            count[0]+=map.get(sum-k);
        }
        if(sum == k){
            count[0]++;
        }
        map.put(sum,map.getOrDefault(sum,0)+1);
        solve(root.left,k,map,sum,count);
        solve(root.right,k,map,sum,count);
        map.put(sum,map.get(sum)-1);
        sum-=root.data;
    }
    public int sumK(Node root, int k) {
        // code here
        int count[] = new int[1];
        HashMap<Integer,Integer>map = new HashMap<>();
        
        solve(root,k,map,0,count);
        
        return count[0];
    }
}
