class Solution {
    // Function to check whether the list is palindrome.
    boolean isPalindrome(Node head) {
        // Your code here
         Node  slow=head;
        Node fast=head;
        Node reverse=null;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        while(slow!=null){
            Node next=slow.next;
            slow.next=reverse;
            reverse=slow;
            slow=next;
        }
        while(reverse!=null){
            if(head.data!=reverse.data){
                return false;
            }
            head=head.next;
            reverse=reverse.next;
        }
        return true;

    }
}
