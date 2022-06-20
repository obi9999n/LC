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
    public void reorderList(ListNode head) {
        
        //find half way point fast & slow pointer
        ListNode s = head;
        ListNode f = head;
        
        while(f != null && f.next != null){
            f = f.next.next;
            s = s.next;
        }
        //reverse second half of list
        ListNode x = null;
        ListNode prev = x;
        
        while(s != null){
            ListNode nn = s.next;
            s.next = prev;
            prev = s;
            s = nn;
        }
        //s is at start of reversed list
        s = prev;
        //f is at head
        f = head;
        
        while(s.next != null){
            ListNode fNew = f.next;
            ListNode sNew = s.next;
            f.next = s;
            s.next = fNew;
            f = fNew;
            s = sNew;
        }
            
    }
}