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
    public int getDecimalValue(ListNode head) {
        double length = 0.0;
        double value = 0;
        String binaryNum = "";
            
        ListNode curr = head;
        while(curr != null){
            binaryNum = binaryNum + Integer.toString(curr.val);
            curr = curr.next;
        }
        
        int i = binaryNum.length() - 1;
        while(i >= 0){
            if (binaryNum.charAt(i) == '1'){
                value = value + Math.pow(2.0, length);
            }
            length = length + 1.0;
            i--;
        }
        
        int trueValue = (int)value;
        return trueValue;
        
    }
}