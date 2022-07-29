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
        
        int lengthA = 0;
        int lengthB = 0;
        
        //calculate list a length
        ListNode currA = headA;
        while(currA != null) {
            lengthA++;
            currA = currA.next;
        }
        
        //calculate list b length
        ListNode currB = headB;
        while(currB != null) {
            lengthB++;
            currB = currB.next;
        }
        currA = headA;
        currB = headB;
        
        int difference = 0;
        //if a length > b length, move curr a up by the difference, else opposite
        if(lengthA > lengthB){
            difference = lengthA - lengthB;
            while(difference > 0){
                currA = currA.next;
                difference--;
            }
        }
        if(lengthB > lengthA){
            difference = lengthB - lengthA;
            while(difference > 0){
                currB = currB.next;
                difference--;
            }
        }
        
        
        //in while loop, check if curr a = curr b
        while(currA != null){
            if(currA == currB) return currA;
            
            currA = currA.next;
            currB = currB.next;
        }
        return null;
    }
}