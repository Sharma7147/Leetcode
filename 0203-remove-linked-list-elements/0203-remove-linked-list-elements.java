class Solution {
    public ListNode removeElements(ListNode head, int val) {

        ListNode temp = new ListNode(-1);
        temp.next = head;
        ListNode current = temp;
        while (current.next != null) {
            if (current.next.val == val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
        return temp.next;
    }
}
