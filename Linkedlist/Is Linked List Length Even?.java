class Solution {
    public boolean isLengthEven(Node head) {
        // code here
           int n=0;
        while(head!=null)
        {
            n=n^1;
            head=head.next;
        }
        if(n==1)
        {
            return false;
        }
        return true;
    }
}
