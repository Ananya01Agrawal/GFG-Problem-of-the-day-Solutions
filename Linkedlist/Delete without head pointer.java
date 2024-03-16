class Solution
{
    void deleteNode(Node del_node)
    {
         //  // Copy data from the next node to the node to be deleted
          del_node.data = del_node.next.data;
           // Adjust the pointers to skip the next node (effectively removing it from the linked list)
         del_node.next = del_node.next.next;
    }
}
