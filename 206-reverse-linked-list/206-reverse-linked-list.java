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
    public ListNode reverseList(ListNode head) {
        if (head == null) return null;
        
        ListNode prev = null;
        ListNode curr = head;
        
        while(curr.next != null){
            ListNode nn = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nn;
        }
        curr.next = prev;
        head = curr;
        return head;
        
    }
}