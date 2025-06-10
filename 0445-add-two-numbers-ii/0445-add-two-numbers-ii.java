
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return reverseList(addTwoNumbers1(reverseList(l1), reverseList(l2)));

    }

    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;
        ListNode next = null;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        return prev;
    }

    public ListNode addTwoNumbers1(ListNode l1, ListNode l2) {

        ListNode head = null;
        ListNode temp = null;
        int carry = 0;
        while (l1 != null || l2 != null || carry != 0) {
            int val1 = (l1 == null) ? 0 : l1.val;
            int val2 = (l2 == null) ? 0 : l2.val;
            int res = val1 + val2 + carry;
            ListNode newNode = new ListNode(res % 10);
            carry = res / 10;

            if (head == null) {
                head = newNode;
                temp = newNode;
            } else {
                temp.next = newNode;
                temp = temp.next;
            }

            if (l1 != null)
                l1 = l1.next;
            if (l2 != null)
                l2 = l2.next;

        }
        return head;

    }
}