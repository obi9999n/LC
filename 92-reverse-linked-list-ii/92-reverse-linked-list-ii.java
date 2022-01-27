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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        //edge case
        if (head.next == null) return head;
        
        //init pointers
        ListNode lInterval = head;
        ListNode rInterval;
        int leftPosition = 1;
        int rightPosition;
        
        
        //finding left value
        while(lInterval.next != null && leftPosition != left){
            lInterval = lInterval.next;
            leftPosition++;
        }
        
        rInterval = lInterval;
        rightPosition = leftPosition;
        ArrayList<Integer> list = new ArrayList<Integer>();
        while(rightPosition != right){
            list.add(rInterval.val);
            rInterval = rInterval.next;
            rightPosition++;
        }
        list.add(rInterval.val);
        ListNode curr = lInterval;
        for(int i = list.size() - 1; i >= 0; i--){
            curr.val = list.get(i);
            curr = curr.next;
        }
        
        return head;
    }
}