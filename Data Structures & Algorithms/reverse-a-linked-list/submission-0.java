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
    public ListNode reverseList(ListNode head) {

        ListNode prev = null; // null // 0
        ListNode curr = head; // 0 // 1

        while (curr != null) {
            ListNode next = curr.next; // 1 // 2

            curr.next = prev; // null // 0

            prev = curr; // 0 // 1

            curr = next; // 1 // 2 






        } return prev;
        
    }
}
