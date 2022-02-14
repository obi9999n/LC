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
        //get length of both linked list
        
        int lengthA = 0;
        int lengthB = 0;
        
        ListNode currA = headA;
        while (currA != null){
            lengthA++;
            currA = currA.next;
        }
        
        ListNode currB = headB;
        while (currB != null){
            lengthB++;
            currB = currB.next;
        }
        
        //get index
        int stopIndex = 0;
        int i = 0;
        if (lengthA < lengthB){
            stopIndex = lengthB - lengthA;
            currB = headB;
            currA = headA;
            while(i < stopIndex){
                currB = currB.next;
                i++;
            }
        } else if (lengthB < lengthA){
            stopIndex = lengthA - lengthB;
            currB = headB;
            currA = headA;
            while(i < stopIndex){
                currA = currA.next;
                i++;
            }
        } else {
            currB = headB;
            currA = headA;   
        }
        
        //find intersect
        while(currA != null && currB != null){
            if (currA == currB){
                return currA;
            }
            currA = currA.next;
            currB = currB.next;
        }
        
        return null;
    }
}