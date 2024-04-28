Node slow = head;
        Node prev = null;
        Node fast = head;
        while(fast != null && fast.next != null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        prev.next= slow.next;
        return head;
    }
}
