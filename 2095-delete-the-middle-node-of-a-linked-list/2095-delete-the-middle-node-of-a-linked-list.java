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
    public ListNode deleteMiddle(ListNode head) {
        //find length of list
        int length = 0;
        ListNode curr = head;
        
        while(curr != null){
            length++;
            curr = curr.next;
        }
        if (length == 1) return null;
        int index = length / 2;
        int i = 0;
        ListNode prev = null;
        curr = head;
        //find index to delete
        while(i != index){
            prev = curr;
            curr = curr.next;
            i++;
        }
        
        prev.next = curr.next;
        return head;
    }
}