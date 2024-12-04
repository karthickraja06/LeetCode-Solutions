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
    public ListNode reverse(ListNode head){
        ListNode prev  = null;
        while(head != null ){
            ListNode front = head.next;
            head.next = prev;
            prev = head;
            head = front;
        }
        return prev;
    }
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next==null)return true;
        if(head.next.next == null) return (head.val == head.next.val)?true:false;
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode head2 = reverse(slow);
        slow.next = null;
        ListNode head1 = head;
        while(head2 != null){
            if(head1.val != head2.val)return false;
            head1 = head1.next;
            head2 = head2.next;
        }
        return true;
    }
}