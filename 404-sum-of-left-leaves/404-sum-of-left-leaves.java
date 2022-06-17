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
    public int sumOfLeftLeaves(TreeNode root) {
        
        return helper(root, false);
    }
    
    public int helper(TreeNode node, boolean isLeft){
        if (node == null) return 0;
        
        if (isLeft == true && node.right == null 
                            && node.left == null){
            return node.val;
        }
        
        return helper(node.left, true) + helper(node.right, false);
            
    }
}