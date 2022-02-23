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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        //edge cases
        if(list1 == null && list2 != null) return list2;
        if(list1 != null && list2 == null) return list1;
        if (list1 == null && list2 == null) return null;
        
        //initialize pointer
        ListNode p1 = list1;
        ListNode p2 = list2;
        //dummy node
        ListNode dummy = new ListNode(0);
        ListNode prev = dummy;
        
        while(p1 != null && p2 != null){
            if (p1.val <= p2.val){
                prev.next = p1;
                p1 = p1.next;
                prev = prev.next;
            } else {
                prev.next = p2;
                p2 = p2.next;
                prev = prev.next;
            }
        }
        if(p1 == null){
            prev.next = p2;
        }
        if(p2 == null){
            prev.next = p1;
        }
        
        return dummy.next;     
    }
}