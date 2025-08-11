// Last updated: 8/11/2025, 11:54:04 PM
class Solution {
    public ListNode reverseList(ListNode head) {
        // Initialize pointers
        ListNode prev = null;
        ListNode current = head;
        ListNode nextTemp = null; // A temporary pointer to store the next node

        while (current != null) {
            // Step 1: Store the next node before we lose the link
            nextTemp = current.next;

            // Step 2: Reverse the current node's pointer to point to the previous node
            current.next = prev;

            // Step 3: Move the pointers one step forward
            prev = current;
            current = nextTemp;
        }

        // After the loop, 'prev' is the new head of the reversed list
        return prev;
    }
}