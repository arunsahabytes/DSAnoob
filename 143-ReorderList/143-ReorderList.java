// Last updated: 8/29/2025, 12:00:07 AM
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
    public void reorderList(ListNode head) {
        
        if (head == null || head.next == null) return;

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode firstHalf = head;
        ListNode secondHalf = slow.next;
        slow.next = null;

        ListNode prev = null;
        ListNode curr = secondHalf;


        while (curr != null) {

            ListNode nxt = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nxt;
        }
        secondHalf = prev;

        while (secondHalf != null) {
    ListNode temp1 = firstHalf.next;
    ListNode temp2 = secondHalf.next;

    firstHalf.next = secondHalf;
    secondHalf.next = temp1;  // \U0001f511 This is what you missed

    firstHalf = temp1;
    secondHalf = temp2;


        }
    }
}
