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
        if(head==null || head.next==null|| k==0)return head;
        ListNode temp=head;
        int leng=1;
        while(temp.next!=null){
            temp=temp.next;
            leng++;
        }
        // making list circular
        temp.next=head;
        // finding new head position 
         k=k%leng;
         int newPosition=leng-k;
         temp=head;
         for(int i=1;i<newPosition;i++){
          temp=temp.next;
         }
         ListNode newHead=temp.next;
         temp.next=null;
         return newHead;

        
    }
}