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
    public ListNode reverseList(ListNode head) {
    ListNode prev = null;
    ListNode current = head;
    ListNode next = null;
    
    while (current != null) {
        next = current.next; // Store the next node
        current.next = prev; // Reverse the current node's pointer
        prev = current;      // Move prev to current
        current = next;      // Move current to next
    }
    
    return prev; 
}
}
 