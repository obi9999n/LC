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
    int count = 0;
    
    public int goodNodes(TreeNode root) {    
        int max = Integer.MIN_VALUE;
        countNode(root, max);
        return count;
    }
    
    public void countNode(TreeNode node, int currMax){
        if(node != null){
            if(node.val >= currMax){
                count++;
            }
            currMax = Math.max(node.val, currMax);
            countNode(node.left, currMax);
            countNode(node.right, currMax);
        }
    }
}