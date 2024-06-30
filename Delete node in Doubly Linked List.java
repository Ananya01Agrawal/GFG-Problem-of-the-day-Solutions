class Solution
{
    // function returns the head of the linkedlist
    Node deleteNode(Node head,int x)
    {
	// Your code here
	Node curr=head;
	int pos=1;
	if(x==1){
	    Node temp=head.next;
	    return temp;
	}
	else{
	    while(curr.next!=null &&pos<x){
	        curr=curr.next;
	        pos++;
	    }
	    if(curr.next==null){
	        curr.prev.next=null;
	        return head;
	    }
	    curr.prev.next=curr.next;
	    curr.next.prev=curr.prev;
	}
	return head;
    }
}
