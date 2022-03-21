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
        //edge case for 1 element 
        if (head.next == null) return head;
        
        //iterate LL and put elements in map
        HashMap<Integer, Integer> map = new HashMap<>();
        ListNode curr = head;
        while(curr != null){
            map.put(curr.val, map.getOrDefault(curr.val, 0) + 1);
            curr = curr.next;
        }
        
        //dummy node just in case first element needs deletion
        ListNode dummy = new ListNode(0);
        ListNode prev = dummy;
        
        curr = head;
        while(curr != null){
            if(map.get(curr.val) == 1){
                prev.next = curr;
                prev = prev.next;
                curr = curr.next;
            } else {
                curr = curr.next;
            }
        }
        ListNode nullNode = null;
        prev.next = nullNode;
        
        return dummy.next;
    }
}