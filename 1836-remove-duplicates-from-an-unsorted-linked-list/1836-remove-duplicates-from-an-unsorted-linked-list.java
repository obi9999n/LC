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
        Set<Integer> set = new HashSet<>();
        Set<Integer> list = new LinkedHashSet<>();
        ListNode result = new ListNode();
        
        while(head != null){
            
            if(set.contains(head.val)){
                list.remove(head.val);
            } else{
                list.add(head.val);
                set.add(head.val);
            }
            
            head = head.next;
        }
        
        head = new ListNode();
        ListNode temp = head;
        
        for (int val : list) {
            temp.next = new ListNode(val);
            temp = temp.next;
        }
        
        return head.next;
    }
}