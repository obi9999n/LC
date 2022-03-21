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
        //find length of list
        ListNode curr = head;
        int length = 0;
        
        while(curr != null){
            length++;
            curr = curr.next;
        }
        
        ListNode first = head;
        ListNode second = head;
        //get first index
        int i = 0;
        int firstIndex = 0 + k - 1;
        while(i != firstIndex){
            first = first.next;
            i++;
        }
        
        //get second index
        i = 0;
        int secondIndex = length - k;
        while(i != secondIndex){
            second = second.next;
            i++;
        }
        
        //swap values
        int temp = first.val;
        first.val = second.val;
        second.val = temp;
        
        return head;
    }
}