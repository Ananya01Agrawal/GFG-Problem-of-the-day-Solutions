 class Solution
{
    Node compute(Node head)
    {
         Node curr;
        Node temp;
        
        if(head==null || head.next==null){
            
            return head;
            
        }
        
        
        curr=head;
        temp=compute(head.next);
        
       if(curr.data<temp.data){
           
           curr=temp;
           head=curr;
           
       }else{
           
           curr.next=temp;
           head=curr;
       }
       return head;
    }
}
