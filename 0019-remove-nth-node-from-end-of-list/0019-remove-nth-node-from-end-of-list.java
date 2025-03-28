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
    int cnt = -1;
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // if(head.next == null)return null
        // if(head == null) return head;
        // removeNthFromEnd(head.next,n);
        // cnt++;
        // if(cnt == n){
        //     head.next = head.next.next;
        // }
        // return head;
        ListNode slow = head,fast = head;
        for(int i = 0;i < n;i++){
            fast = fast.next;
        }
        if(fast == null)return head.next;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return head;
    }
}