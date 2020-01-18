/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode prev=new ListNode(0);
        ListNode result=prev;
        if(head==null || head.next==null)
            return head;
        ListNode nxt=head.next;
        if(head.val!=nxt.val)
        {
            prev.next=head;
            prev=prev.next;
        }
        int lastVal=head.val;
        while(nxt!=null)
        {
            if(nxt.val!=lastVal && (nxt.next==null || nxt.next.val!=nxt.val))
            {
                prev.next=nxt;
                prev=prev.next;
            }
            lastVal=nxt.val;
            nxt=nxt.next;
        }
        prev.next=nxt;
        return result.next;
    }
}
