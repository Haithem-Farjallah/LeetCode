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
    public ListNode modifiedList(int[] nums, ListNode head) {
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        while(head!=null && set.contains(head.val)){
            head=head.next;
        }
        ListNode dummy=head;
        while( head.next!=null){
            if(set.contains(head.next.val)){
                head.next=head.next.next;
            }else {
            head=head.next;
            }
        }
        return dummy;
    }
}