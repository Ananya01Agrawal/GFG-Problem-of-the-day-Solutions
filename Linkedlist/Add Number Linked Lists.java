/* node for linked list

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

*/

class Solution {
    static Node addTwoLists(Node num1, Node num2) {
        // code here
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();
        while(num1 != null){
            s1.push(num1.data);
            num1 = num1.next;
        }
         while(num2 != null){
            s2.push(num2.data);
            num2 = num2.next;
        }
        Node result = null;
        int carry = 0;
        while(!s1.isEmpty() || !s2.isEmpty() || carry != 0){
            int val1 = s1.isEmpty() ? 0: s1.pop();
            int val2 = s2.isEmpty()? 0: s2.pop();
            int sum = val1 + val2 + carry;
           
            Node newNode = new Node(sum % 10);
            newNode.next = result;
            result = newNode;
            carry = sum / 10;
            
        }
        while (result != null && result.data == 0) {
        result = result.next;
    }

    // If the result is empty (in case of 0), return a single node with 0
    return result != null ? result : new Node(0);
    }
}
