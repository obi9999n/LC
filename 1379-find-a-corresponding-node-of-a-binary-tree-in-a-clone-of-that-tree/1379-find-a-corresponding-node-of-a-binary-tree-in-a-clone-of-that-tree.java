/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    TreeNode answer = null;
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        getTarget(original, cloned, target);
        return answer;
    }
    
    //inorder traversal
    public void getTarget(TreeNode original, TreeNode cloned, TreeNode target) {
        if(original == null) return;
        
        if (original.val == target.val) {
            answer = cloned;
        }
        
        getTarget(original.left, cloned.left, target);
        getTarget(original.right, cloned.right, target);
    }
}