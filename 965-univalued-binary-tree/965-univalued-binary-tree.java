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
    public boolean isUnivalTree(TreeNode root) {
        if (root == null) return true;
        
        return validate(root, root.val);
        
    }
    
    public boolean validate(TreeNode node, int val) {
        if (node == null) return true;
        if (node.val != val) return false;
        
        return validate(node.left, val) && validate(node.right, val);
    }
}