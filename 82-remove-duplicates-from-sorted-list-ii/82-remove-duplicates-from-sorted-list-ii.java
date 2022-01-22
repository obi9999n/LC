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
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) return null;
        
        ListNode dummy = new ListNode(0);
        ListNode prev = dummy;
        ListNode p1 = head;
        dummy.next = head;
        
        while(p1.next != null){
            ListNode nn = p1.next;
            if(nn.val != p1.val){
                prev = p1;
                p1 = p1.next;
            } else {
                while (nn != null && nn.val == p1.val){
                    nn = nn.next; 
                }
                if(nn == null){
                    prev.next = null;
                    return dummy.next;
                }
                prev.next = nn;
                p1 = nn;    
            }
        }
        
        return dummy.next;        
    }
}