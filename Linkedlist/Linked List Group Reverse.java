

/*node class of the linked list
class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}

*/

class Solution {
    public static Node reverseKGroup(Node head, int k) {
         if(k == 1) return head;
        
        Node curr = head, pre = null;
        
        for(int i = 0; i < k && curr != null; i++){
            Node nxt = curr.next;
            curr.next = pre;
            pre = curr;
            curr = nxt;
        }
        Node start = head;
        head = pre;
        int cnt = 0;
        if(curr == null) return head;
        pre = null;
        Node newSt = curr;
        
        while(curr != null){
            if(cnt < k){
                cnt++;
                Node nxt = curr.next;
                curr.next = pre;
                pre = curr;
                curr = nxt;
            }else{
                start.next = pre;
                start = newSt;
                newSt = curr;
                cnt = 0;
                pre = null;
            }
        }
        
        start.next = pre;
        return head;
    }
}
