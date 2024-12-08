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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null || k == 0) return head;
        int len = 1;
        ListNode temp = head;
        while(temp.next != null){
            len++;
            temp = temp.next;
        }
        k = k%len;
        if(k == 0)return head;
        temp.next = head;
        k = len - k;
        ListNode end = null,start = head;
        while(k > 0){
            end = start;
            start = start.next;
            k--;
        }
        end.next = null;
        return start;
    }
}