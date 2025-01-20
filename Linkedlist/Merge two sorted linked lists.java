

/*
  Node is defined as
    class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }
*/

class Solution {
    Node sortedMerge(Node head1, Node head2) {
        // code here
         if(head1==null || head2==null){
            return (head1!=null)?head1:head2;
        }
        if(head1.data>head2.data){
            Node temp=head1;
            head1=head2;
            head2=temp;
        }
        head1.next=sortedMerge(head1.next,head2);
        return head1;
    }
}
