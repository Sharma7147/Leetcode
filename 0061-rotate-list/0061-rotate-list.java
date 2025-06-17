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
    public ListNode rotateRight(ListNode head, int k) {
        int length=0;
        ListNode tt=head;
        if(head==null|| head.next==null){
    return head;
}
while(tt!=null){
    length++;
    tt=tt.next;
}
k=k%length;

        for(int i=0;i<k;i++){
            ListNode temp=head;
            ListNode st=new ListNode(-1);
            st.next=head;
            while(temp.next!=null){
                temp=temp.next;
                st=st.next;
            }
            ListNode s=temp;
            st.next=null;
            s.next=head;
            head=s;

        }
        return head;

    }
}