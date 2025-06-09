/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode temp1 = list1;
        ListNode temp2 = list2;
        ListNode ans = new ListNode(-1);
        ListNode dummy = ans;
        while (temp1 != null && temp2 != null) {
            if (temp1.val < temp2.val) {
                dummy.next = new ListNode(temp1.val);
                dummy = dummy.next;
                temp1 = temp1.next;
            } else {
                dummy.next = new ListNode(temp2.val);
                dummy = dummy.next;
                temp2 = temp2.next;

            }

        }
        if (temp1 == null) {
            dummy.next = temp2;
        } else {
            dummy.next = temp1;
        }

        return ans.next;
    }
}