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
    public ListNode swapNodes(ListNode head, int k) {
        //find length
        ListNode curr = head;
        int l = 0;
        while (curr != null){
            l++;
            curr = curr.next;
        }
        //index of nodes to swap
        int beginIndex = 0 + k - 1;
        int endIndex = l - k;
        
        //find location of beginning
        ListNode beginNode = head;
        int counter = 0;
        while(counter != beginIndex){
            beginNode = beginNode.next;
            counter++;
        }
        
        //find location of end
        ListNode endNode = head;
        counter = 0;
         while(counter != endIndex){
            endNode = endNode.next;
            counter++;
        }
        
        //change values
        int temp = beginNode.val;
        beginNode.val = endNode.val;
        endNode.val = temp;
        
        return head;
        
        
        
    }
}