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
        ListNode temp= head;
        if(temp==null)
            return head;
        ListNode tmpnext= head.next;
        while(tmpnext!=null)
        {
            if(tmpnext.val==temp.val)
                tmpnext=tmpnext.next;
            else
            {
                temp.next=tmpnext;
                tmpnext=tmpnext.next;
                temp=temp.next;
            }
        }
        temp.next=tmpnext;
        return head;
    }
}
