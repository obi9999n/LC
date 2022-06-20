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
    public ListNode plusOne(ListNode head) {
        ListNode newNode = new ListNode(1);
        
        //edge case
        if(head.next == null){
            if(head.val == 9){
                head.val = 0;
                newNode.next = head;
                return newNode;
            } else {
                head.val = head.val + 1;
                return head;
            }
        }
        
        //reverse linked list
        ListNode prev = null;
        ListNode curr = head;
        while(curr != null){
            ListNode nn = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nn;
        }
        
        //curr starts at new reversed list beginning 
        curr = prev;
        
        ListNode nextCurr = prev;
        while(curr != null){
            if (curr.val < 9){
                curr.val = curr.val + 1;
                break;
            } else {
                curr.val = 0;
            }
        
            curr = curr.next;
        }
        
        //re reverse list
        curr = nextCurr;
        prev = null;
        while(curr != null){
            ListNode newN = curr.next;
            curr.next = prev;
            prev = curr;
            curr = newN;
        }
        
        if (prev.val != 0){
            return prev;
        }
    
        //if all numbers are 9
        newNode.next = prev;
        return newNode;
        
    }
}