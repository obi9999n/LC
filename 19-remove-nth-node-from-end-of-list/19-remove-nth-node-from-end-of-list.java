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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        //find length of list
        int length = 0;
        ListNode curr = head;
        
        while (curr != null){
            length++; 
            curr = curr.next;
        }
        
        //dummy node in case node to delete is first node
        ListNode dummy = new ListNode(0);
        ListNode prev = dummy;
        prev.next = head;
    
        if (length == n){
            prev.next = head.next;
            return prev.next;
        }
        
        int i = 0;
        int deleteIndex = length - n;
        curr = head;
        //find delete index
        
        while(i != deleteIndex){
            i++;
            curr = curr.next;
            prev = prev.next;
        }
        
        prev.next = curr.next;
        return dummy.next;
    }
}