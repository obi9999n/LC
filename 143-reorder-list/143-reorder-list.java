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
    public void reorderList(ListNode head) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        ListNode p1 = head;
        
        
        while(p1 != null){
            list.add(p1.val);
            p1 = p1.next;
        }
        
        int i = 1;
        int j = list.size() - 1;
        p1 = head.next;
        if (list.size() % 2 == 0){
            while(i < j){
                p1.val = list.get(j);
                p1 = p1.next;
                p1.val = list.get(i);
                p1 = p1.next;
                j--;
                i++;
            }  
            p1.val = list.get(i);    
        } else {
            while(i < j){
                p1.val = list.get(j);
                p1 = p1.next;
                p1.val = list.get(i);
                p1 = p1.next;
                j--;
                i++;
            }   
        } 
    }
}