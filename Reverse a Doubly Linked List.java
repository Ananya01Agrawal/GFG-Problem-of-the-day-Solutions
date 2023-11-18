public static Node reverseDLL(Node  head)
{
    //Your code here
    Node temp=head;
    Node prev=null;
    Node next=null;
    while(temp!=null){
        next=temp.next;
        temp.next=prev;
        temp.prev=next;
        prev=temp;
        temp=next;
    }
    return prev;
}
