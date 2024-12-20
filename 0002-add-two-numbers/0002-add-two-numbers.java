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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
         ListNode sum=new ListNode();
        ListNode res=sum;
        int car=0;
        int total=0;
        while(l1!=null || l2!=null || car!=0){
          total=car;
          if(l1!=null){
            total+=l1.val;
            l1=l1.next;
          }
          if(l2!=null){
            total+=l2.val;
            l2=l2.next;
          }
          int num=total%10;
          car=total/10;
          sum.next=new ListNode(num);
          sum=sum.next;

        }
        return res.next;
    }
}