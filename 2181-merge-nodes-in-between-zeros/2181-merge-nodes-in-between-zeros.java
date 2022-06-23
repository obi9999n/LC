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
    public ListNode mergeNodes(ListNode head) {
        
        int iteration = 1;
        int currSum = 0;
        ListNode curr = head.next;
        ListNode prev = head;
        ListNode newHead = null;
        
        while(curr != null){
            ListNode newNode = new ListNode(0);
            if(curr.val != 0) {
                currSum = currSum + curr.val;
                curr = curr.next;
            } else {
                prev.next = newNode;
                //create new node with curr sum
                newNode.val = currSum;
                prev = newNode;
                curr = curr.next;
                currSum = 0;
                if(iteration == 1){
                    newHead = prev;
                    iteration++;
                } 
            }
        }
        
        prev.next = null;
        
        return newHead;
    }
}