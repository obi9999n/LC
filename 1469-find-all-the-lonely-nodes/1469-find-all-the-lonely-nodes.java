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
    public List<Integer> getLonelyNodes(TreeNode root) {
        List<Integer> arr = new ArrayList<>();
        //base case 
        if (root.left == null && root.right == null) return arr;
        helper(root, arr);
        return arr;
    }
    
    public void helper (TreeNode node, List<Integer> list){
        if(node != null){
            if (node.left != null && node.right == null){
                list.add(node.left.val);
            }
            if (node.right != null && node.left == null){
                list.add(node.right.val);
            }
            helper(node.left, list);
            helper(node.right, list);
        }
    }
}