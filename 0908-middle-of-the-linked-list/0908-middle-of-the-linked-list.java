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
    public ListNode middleNode(ListNode head) {

        ListNode temp=head;
        int counter=0;
        while(temp!=null){
            temp=temp.next;
            counter++;
        }
        counter=counter/2 ;
temp=head;
        while(counter>0){
            temp=temp.next;
            counter--;
        }
        return temp;
        

        
    }
}