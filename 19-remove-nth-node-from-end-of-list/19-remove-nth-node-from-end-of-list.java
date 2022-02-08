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
        ListNode curr = head;
        int l = 0;
        //get length of linked list
        while (curr != null){
            l++;
            curr = curr.next;
        }
        
        ListNode dummy = new ListNode(0);
        ListNode prev = dummy;
        prev.next = head;
        curr = head;
        int index = 0;
        
        //find node to delete 
        while(index != l - n){
            curr = curr.next;
            prev = prev.next;
            index++;
        }
        
        prev.next = curr.next;
        return dummy.next;
        
    }
}