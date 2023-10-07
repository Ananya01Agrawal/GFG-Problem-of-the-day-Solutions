class Solution {
    // Function to pairwise swap elements of a linked list.
    // It should returns head of the modified list
    public Node pairwiseSwap(Node head)
    {
        if(head == null)
            return null;
            
        Node dummy = new Node(0);
        dummy.next = head;
        
        Node p = dummy, curr = head;
        while(curr != null && curr.next != null) {
            Node nxt = curr.next;
            curr.next = nxt.next;
            nxt.next = p.next;
            p.next = nxt;
            
            p = curr;
            curr = curr.next;
        }
        
        return dummy.next;
    }
}
