/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        //find lengths of a list and b list
        int lengthA = 0;
        int lengthB = 0;
        
        ListNode curr = headA;
        while(curr != null){
            lengthA++;
            curr = curr.next;
        }
        curr = headB;
        while(curr != null){
            lengthB++;
            curr = curr.next;
        }
        
        
        int diff;
        ListNode currA = headA;
        ListNode currB = headB;
        
        if (lengthA < lengthB){
            diff = lengthB - lengthA;
            while(diff > 0){
                currB = currB.next;
                diff--;
            }
        } else if (lengthB < lengthA){
            diff = lengthA - lengthB;
            while(diff > 0){
                currA = currA.next;
                diff--;
            }
        }
        
        while(currA != null && currB != null){
            if(currA == currB) return currB;
            currA = currA.next;
            currB = currB.next;
        }
        
        return null;
        
    }
}