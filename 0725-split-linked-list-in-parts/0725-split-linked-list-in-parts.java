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
    public ListNode[] splitListToParts(ListNode head, int k) {
        int len = 0;
        ListNode temp = head;
        ListNode[] ans = new ListNode[k];

        while (temp != null) {
            len++;
            temp = temp.next;
        }

        if (len <= k) {
            for (int i = 0; i < len; i++) {
                ans[i] = head;
                ListNode next = head.next;
                head.next = null;
                head = next;
            }
            for (int i = len; i < k; i++) {
                ans[i] = null;
            }
        }

        else {
            int baseSize = len / k;
            int extra = len % k;

            ListNode curr = head;
            for (int i = 0; i < k; i++) {
                ans[i] = curr;
                int partSize = baseSize + (extra > 0 ? 1 : 0);
                extra--;

                for (int j = 1; j < partSize; j++) {
                    
                        curr = curr.next;
                }

                if (curr != null) {
                    ListNode nextPart = curr.next;
                    curr.next = null;
                    curr = nextPart;
                }
            }
        }

        return ans;
    }
}
