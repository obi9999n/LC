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
    public ListNode removeElements(ListNode head, int val) {
        //if no elements in LL
        if(head == null) return null;
        
        //create dummy node to easily keep track of previous node at start
        ListNode sentinel = new ListNode(0);
        ListNode prev = sentinel;
        ListNode curr = head;
        
        while(curr != null){
            ListNode tmp = curr.next;
            
            //if curr = val loop till tmp is not val
            if(curr.val == val){
                while(tmp != null && tmp.val == val){
                    tmp = tmp.next;
                }
                prev.next = tmp;
                curr = tmp;
            } else {
                prev.next = curr;
                prev = curr;
                curr = tmp;
            }
        }
        
        return sentinel.next;
        
    }
}