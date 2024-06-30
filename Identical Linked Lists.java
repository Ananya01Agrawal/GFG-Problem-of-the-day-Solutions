class Solution {
    // Function to check whether two linked lists are identical or not.
    public boolean areIdentical(Node head1, Node head2) {
        // write your code here
        if(head1==null || head2==null){
            if(head1!=head2) return false;
            else return true;
        }
        if(head1.data==head2.data){
            return areIdentical(head1.next,head2.next);
        }
        else{
            return false;
        }
    }
}
