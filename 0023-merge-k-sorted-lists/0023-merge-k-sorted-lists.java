
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode ans = null;
        if (lists.length == 0)
            return ans;
        if (lists.length == 1 && lists[0] == null)
            return ans;
        if (lists.length == 1) {
            return lists[0];
        }
        ListNode l = mergeTwoSortedLists(lists[0], lists[1]);

        for (int i = 2; i < lists.length; i++) {

            l = mergeTwoSortedLists(l, lists[i]);

        }
        return l;

    }

    public ListNode mergeTwoSortedLists(ListNode l1, ListNode l2) {

        ListNode temp1 = l1;
        ListNode temp2 = l2;
        ListNode ans = new ListNode(-1);
        ListNode dummy = ans;

        while (temp1 != null && temp2 != null) {
            if (temp1.val > temp2.val) {
                dummy.next = new ListNode(temp2.val);

                dummy = dummy.next;
                temp2 = temp2.next;
            } else {
                dummy.next = new ListNode(temp1.val);

                dummy = dummy.next;
                temp1 = temp1.next;
            }
        }

        if (temp2 == null) {
            dummy.next = temp1;
        } else {
            dummy.next = temp2;
        }
        return ans.next;
    }
}