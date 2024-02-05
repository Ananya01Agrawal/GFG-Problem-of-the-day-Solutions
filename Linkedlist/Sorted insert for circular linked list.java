class Solution {
    public Node sortedInsert(Node head, int data) {
        // code here
        Node newnode=new Node(data);
          //if circular linked list is empty
          if(head==null){
                 //point it to itself
                 newnode.next=newnode;
                 return newnode;
           }
           //insert at beginning
           if(head.data>=data){
                   newnode.next=head;
                   Node temp=head;
                   while(temp.next!=head){
                       temp=temp.next;
                   }
                   temp.next=newnode;
                   return newnode;
           }
           //insert at a position in between or end
           else{
                 Node temp=head;
                 while(temp.next!=head && temp.next.data<data){
                            temp=temp.next;
                 }
                newnode.next=temp.next;
                temp.next=newnode;
                return head;
           }
   }
}
