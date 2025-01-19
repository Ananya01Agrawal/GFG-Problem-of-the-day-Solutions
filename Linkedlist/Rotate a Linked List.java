/* node of linked list:

class Node{
    int data;
    Node next;
    Node(int d){
        data=d;
        next=null;
    }
}

*/

class Solution {
    public Node rotate(Node head, int k) {
         Node temp=head;
        int n=1;
        while(temp.next != null)
        {  
            n++;
            temp=temp.next;
        }
   
        k=k%n;
        if(k==0) return head;
        temp.next=head;
        //temp=head;
        int steps=k;
        
        while(steps-- > 0)
            temp=temp.next;
            
        head=temp.next;
        temp.next=null;
        return head;
        
    }
}
