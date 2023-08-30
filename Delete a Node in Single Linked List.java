class GfG
{
    Node deleteNode(Node head, int x)
    {
	// Your code here
	Node temp=head;
	if(x==1){
	    return head.next;
	}
	for(int i=2;i<x;i++){
	    temp=temp.next;
	}
    temp.next=temp.next.next;
    return head;
    }
}
