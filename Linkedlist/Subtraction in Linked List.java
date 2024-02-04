/*

Definition for singly Link List Node
class Node
{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}

You can also use the following for printing the link list.
Node.printList(Node node);
*/

class Solution {
    // Method to subtract two linked lists representing numbers
    public Node subLinkedList(Node head1, Node head2) {
        // Remove leading zeros from both linked lists
        while (head1 != null && head1.data == 0)
            head1 = head1.next;

        while (head2 != null && head2.data == 0)
            head2 = head2.next;

        // Get lengths of both linked lists
        int s1 = getLength(head1), s2 = getLength(head2);

        // If both linked lists are empty, return a new node with value 0
        if (s1 == 0 && s2 == 0)
            return new Node(0);

        // Ensure head2 points to the shorter linked list
        if (s2 > s1) {
            Node temp = head1;
            head1 = head2;
            head2 = temp;
        }

        // If lengths are equal, compare each digit and adjust pointers if needed
        if (s1 == s2) {
            Node curr1 = head1, curr2 = head2;
            while (curr1.data == curr2.data) {
                curr1 = curr1.next;
                curr2 = curr2.next;

                // If we reach the end of the shorter linked list, return a new node with value 0
                if (curr1 == null)
                    return new Node(0);
            }
            // Adjust pointers if the current digit in head2 is greater than head1
            if (curr2.data > curr1.data) {
                Node temp = head1;
                head1 = head2;
                head2 = temp;
            }
        }

        // Reverse both linked lists for easier subtraction
        head1 = reverse(head1);
        head2 = reverse(head2);

        Node ans = null; // Resultant linked list
        while (head1 != null) {
            int n1 = head1.data;
            int n2 = 0;
            if (head2 != null)
                n2 = head2.data;

            // Subtract digits, handle borrowing if necessary
            if (n1 < n2) {
                if (head1.next != null) {
                    head1.next.data -= 1; // Borrow from the next digit
                }
                n1 += 10; // Add 10 to the current digit
            }

            // Create a new node with the result and update pointers
            Node curr = new Node(n1 - n2);
            curr.next = ans;
            ans = curr;

            head1 = head1.next;
            if (head2 != null)
                head2 = head2.next;
        }

        // Remove leading zeros from the result
        while (ans != null && ans.next != null) {
            if (ans.data == 0) {
                ans = ans.next;
            } else {
                break;
            }
        }

        return ans; // Return the result
    }

    // Method to calculate the length of a linked list
    int getLength(Node head) {
        int cnt = 0;
        for (Node curr = head; curr != null; curr = curr.next)
            cnt++;
        return cnt;
    }

    // Method to reverse a linked list
    Node reverse(Node head) {
        Node prev = null, curr = head, next = null;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev; // Return the new head of the reversed linked list
    }
}

        
