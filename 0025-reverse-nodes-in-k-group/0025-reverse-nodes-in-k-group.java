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
    public ListNode reverseKGroup(ListNode head, int k) {
        if(k == 1) return head;
        int cnt = 0;
        ListNode temp = head,prev = null,last = null,prevLast = null;
        boolean status = false;
        while(temp != null){
            if(cnt == 0){
                prevLast = last;//null at first
                last = temp;
            }
            ListNode front = temp.next;
            temp.next = prev;
            prev = temp;
            temp = front;
            cnt++;
            if(cnt == k){
                if(!status){
                    head = prev;
                    status = true;
                }
                if(prevLast != null)prevLast.next = prev;// change
                cnt = 0;
                prev = null;
            }
        }
        if(cnt != 0 && cnt != k){
            temp = prev;
            prev = null;
            while(temp != null){
                ListNode front = temp.next;
                temp.next = prev;
                prev = temp;
                temp = front;
            }
        }
        if(cnt != 0 && prevLast != null)prevLast.next = prev;
        return head;
    }
}