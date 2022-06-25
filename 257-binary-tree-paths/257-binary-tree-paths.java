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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> list = new ArrayList<String>();
        int idx = 0;
        String s = "";
        this.helper(root, list, s, idx);
        
        return list;
        
    }
    
    private void helper(TreeNode node, List<String> answer, String str, int i){
        if (node == null) return;
        
        if(node.left == null && node.right == null){
            str = str + String.valueOf(node.val);
            answer.add(str);
            
        } else {
            str = str + String.valueOf(node.val) + "->";
            helper(node.left, answer, str, i + 1);
            
            helper(node.right, answer, str, i + 1);
            

        }
        if (i > 0){
            str = str.substring(0, i - 1);
            return;
        }
    }
}