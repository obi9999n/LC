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
    public ListNode swapNodes(ListNode head, int k) {
        //edge case
        if(head == null) return head;
        
        // find length
        int l = 0;
        ListNode curr = head;
        while(curr != null){
            l++;
            curr = curr.next;
        }
        
        //find first and second node in one pass
        curr = head;
        int pos = 1;
        ListNode first = null;
        ListNode second = null;
        
        while(curr != null){
            if(pos == k){
                first = curr;
            }
            if(pos == l - k + 1){
                second = curr;
            }
            curr = curr.next;
            pos++;
        }
        
        //swap vals
        int temp = first.val;
        first.val = second.val;
        second.val = temp;
        
        return head;
    }
}