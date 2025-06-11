class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode copy = copyList(head);

        ListNode reversed = reverselist(copy);

        ListNode temp1 = head;
        ListNode temp2 = reversed;
        while (temp1 != null && temp2 != null) {
            if (temp1.val != temp2.val)
                return false;
            temp1 = temp1.next;
            temp2 = temp2.next;
        }

        return true;
    }

    public ListNode reverselist(ListNode list) {
        ListNode prev = null;
        ListNode current = list;
        ListNode next = null;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        return prev;
    }

    public ListNode copyList(ListNode head) {
        if (head == null) return null;
        
        ListNode newHead = new ListNode(head.val);
        ListNode current = newHead;
        ListNode original = head.next;

        while (original != null) {
            current.next = new ListNode(original.val);
            current = current.next;
            original = original.next;
        }

        return newHead;
    }
}
