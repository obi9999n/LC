/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int sum = 0;
    
    public int sumNumbers(TreeNode root) {
        
        //string for adding each root to node number  
        String s = "";
        helper(root, s);
        return sum;
    }
    
    public void helper(TreeNode root, String string){
        if(root == null){
            return;
        }
        
        if(root.left == null && root.right == null){
            //hit a leaf node
            string = string + String.valueOf(root.val);
            sum = sum + Integer.valueOf(string);
        } else {
            string = string + String.valueOf(root.val);
            helper(root.left, string);
            helper(root.right, string);
        }
        
        string = string.substring(0, string.length() - 1);
    }
}