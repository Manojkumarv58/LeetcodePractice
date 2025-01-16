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
    public ListNode removeNthFromEnd(ListNode head, int n) {
         ListNode fast = head;
        int c=0;
        while(fast!=null){
            c++;
            fast=fast.next;
        }
       ListNode prev=null;
       fast=head;

        for(int i=1;i<c-n+1;i++){
        prev=fast;
        fast=fast.next;
        }
       if(prev==null){
           head= head.next;
           return head;
       }else{
           prev.next=prev.next.next;
           return head;
       }

    }
}