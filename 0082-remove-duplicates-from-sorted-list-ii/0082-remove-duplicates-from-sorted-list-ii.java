
class Solution {
    public ListNode deleteDuplicates(ListNode head) {

        ListNode temp = new ListNode(-1);
        temp.next = head;
        ListNode ans = temp;
        while (temp.next != null && temp.next.next != null) {
            if (temp.next.val != temp.next.next.val) {
                temp = temp.next;
            } else {
                ListNode curr = temp.next;
                while (curr.next!=null && curr.val == curr.next.val) {
                    curr = curr.next;

                }
                temp.next = curr.next;
            }
        }
        return ans.next;

    }
}