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
        if(root == null) return 0;
        
        int ans = helper(root, 0, false);
        return ans;
    }
    
    //helper to add to left sum
    public int helper(TreeNode node, int sum, boolean isLeft){
        if(node == null) return 0;
        
        if(node.left == null && node.right == null && isLeft == true){
           return sum = sum + node.val;
        }
        
        return helper(node.left, sum, true) + helper(node.right, sum, false);
    }
}