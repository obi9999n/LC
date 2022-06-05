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
        //if one node in list
        if (head.next == null){
            return head;
        }
        
        //if more than 1 node 
        //first find length of list: o(n)
        int length = 0;
        ListNode curr = head;
        while(curr != null){
            length++;
            curr = curr.next;
        }
        
        ListNode right;
        ListNode left;
        ListNode curr1 = head;
        ListNode curr2 = head;
        
        //find left node 
        int pos = 1;
        while(pos != k){
            curr1 = curr1.next;
            pos++;
        }
        pos = 1;
        
        //find right node
        while(pos != length - k + 1){
            curr2 = curr2.next;
            pos++; 
        }
        
        //do swap
        int temp = curr1.val;
        curr1.val = curr2.val;
        curr2.val = temp;
        return head;
    }
}