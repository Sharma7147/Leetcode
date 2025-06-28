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
    public ListNode swapNodes(ListNode head, int k) {

        int length = 0;
        ListNode temp = head;
        ListNode temp1 = head;

        while (temp != null) {
            length++;
            temp = temp.next;
        }

        temp = head;
        length = length - k;
        while (k > 1) {
            temp = temp.next;
            k--;
        }

        while (length > 0) {

            temp1 = temp1.next;
            length--;
        }

        int var;
        var = temp.val;
        temp.val = temp1.val;
        temp1.val = var;

        return head;
    }
}