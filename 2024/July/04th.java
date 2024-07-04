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
    public ListNode mergeNodes(ListNode head) {
        ListNode dummy = new ListNode(0);
        ListNode cur = dummy;
        int count = 0;

        head = head.next;

        while (head != null) {
            if (head.val != 0) {
                count += head.val;
            } else {
                cur.next = new ListNode(count);
                cur = cur.next;
                count = 0;
            }
            head = head.next;
        }

        return dummy.next;
    }
}
