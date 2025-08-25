// Last updated: 8/26/2025, 4:23:55 AM
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode temp = head;


        while(temp!=null){
            ListNode front = temp.next;
            temp.next = prev;
            prev = temp;
            temp=front;
        }
        return prev;
    }
}