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
    public int getDecimalValue(ListNode head) {
        //reverse linked list
        ListNode curr = head;
        ListNode prev = null;
        
        while(curr != null) {
            ListNode nn = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nn;
        }
        curr = prev;
        
        //for each 1, do 2^x  X: 0,1,2,3...
        double power = 0.0;
        double ans = 0.0;
        while (curr != null){
            if (curr.val == 1){
                ans = ans + Math.pow(2.0, power);
            }
            power = power + 1.0;
            curr = curr.next;
        }
        
        return (int) ans ;
        
    }
    
}