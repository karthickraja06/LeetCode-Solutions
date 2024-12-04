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
    public ListNode middleElement(ListNode s,ListNode e){
        ListNode slow = s,fast = s;
        while((fast != e && fast.next != e)){ // null error might happen
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public void merge(ListNode left,ListNode leftEnd, ListNode right,ListNode rightEnd){
        ArrayList<Integer> temp = new ArrayList<>();
        ListNode st = left;
        while(left != leftEnd.next && right != rightEnd.next){
            if(left.val <= right.val){
                temp.add(left.val);
                left = left.next;
            }else{
                temp.add(right.val);
                right = right.next;
            }
        }
        while(left != leftEnd.next){
            temp.add(left.val);
            left = left.next;
        }
        while(right != rightEnd.next){
            temp.add(right.val);
            right = right.next;
        }
        for(Integer i: temp){
            st.val = (int)i;
            st = st.next;
        }

    }
    public void mergeSort(ListNode start,ListNode end){
        if(start == end)return;
        ListNode mid = middleElement(start,end);
        mergeSort(start,mid);
        mergeSort(mid.next,end);
        merge(start,mid,mid.next,end);
    }
    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null)return head;
        ListNode end = head;
        while(end != null && end.next != null){
            end = end.next;
        }
        mergeSort(head,end);
        return head;
        
    }
}