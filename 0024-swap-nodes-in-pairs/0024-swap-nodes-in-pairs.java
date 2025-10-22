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
    public ListNode swapPairs(ListNode head) {
         ListNode dummy = new ListNode(0, head);
        ListNode prev = dummy, cur = head;

        while (cur != null && cur.next != null) {
            ListNode node1 = cur.next;
            ListNode node2 = cur.next.next;
            node1.next = cur;
            cur.next = node2;
            prev.next = node1;
            prev = cur;
            cur = node2;
        }

        return dummy.next;  
    }
}