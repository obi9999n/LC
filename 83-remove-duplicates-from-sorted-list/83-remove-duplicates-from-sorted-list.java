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
        
        ListNode p1 = head;
        while(p1.next != null){
            ListNode nn = p1.next;
            while(nn != null && nn.val == p1.val){
                nn = nn.next;
            }
            if (nn == null){
                p1.next = null;
                return head;
            }
            p1.next = nn;
            p1 = nn;
        }
        
        return head;
        
    }
}