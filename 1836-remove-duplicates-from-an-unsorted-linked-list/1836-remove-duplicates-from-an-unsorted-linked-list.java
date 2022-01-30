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
    public ListNode deleteDuplicatesUnsorted(ListNode head) {
        
        if (head.next == null){
            return head;
        }
        //edge case
        
        ListNode dummy = new ListNode(0);
        ListNode prev = dummy;
        ListNode curr = head;
        dummy.next = head;
        
        
        //find frecuency of numbers
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        while(curr != null){
            map.put(curr.val, map.getOrDefault(curr.val, 0) + 1);
            curr = curr.next;
        }
        
        //re init curr to head 
        curr = head;
        while(curr != null){
            int frecuency = map.get(curr.val);
            if(frecuency > 1){
                prev.next = curr.next;
            } else {
                prev = curr;
                
            }
            curr = curr.next;
        }

        return dummy.next;
        
    }
}