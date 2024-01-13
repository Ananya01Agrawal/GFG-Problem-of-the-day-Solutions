class Solution
{
    public static Node insertionSort(Node head)
    {
        if(head==null|| head.next==null) return head;
        Node temp=head;
        Node cur=head.next;
        while(cur!=null){
            while(temp!=null){
                if(temp.data>cur.data){
                    int d=temp.data;
                    temp.data=cur.data;
                    cur.data=d;
                }
                temp=temp.next;
            }
            temp=head;
            cur=cur.next;
        }
        return temp;
    }
}
