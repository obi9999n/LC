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
        //edge case
        if (head == null) return null;
        
        ListNode dummy = new ListNode(0);
        ListNode prev = dummy;
        ListNode curr = head;
        
        while(curr != null){
           if (curr.val == val && curr.next != null){
               while(curr != null && curr.val == val){
                   curr = curr.next;
                   
               }
           } else if(curr.val == val && curr.next == null){   //edge case for when last element is val
               prev.next = null;
               break;
           }
           prev.next = curr;
           prev = prev.next;
            if(curr != null){
                curr = curr.next;  
            }     
        }
        
        return dummy.next;
    }
}