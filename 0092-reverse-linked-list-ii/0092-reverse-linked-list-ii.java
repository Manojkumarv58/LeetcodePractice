class Solution{
public static ListNode reverseBetween(ListNode head, int m, int n) {
    if (head == null) return null;

    ListNode dummy = new ListNode(0);
    dummy.next = head;
    ListNode pre = dummy;
    // Move `pre` to the node before reversal starts
    for (int i = 1; i < m; i++) pre = pre.next;

    ListNode start = pre.next;   // first node of sublist
    ListNode then = start.next;  // node that will be moved

    // Reverse sublist
    for (int i = 0; i < n - m; i++) {
        start.next = then.next;
        then.next = pre.next;
        pre.next = then;
        then = start.next;
    }

    return dummy.next;
}
}