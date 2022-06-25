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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        if (root == null) return list;
        Queue<TreeNode> queue = new LinkedList<TreeNode>();

        int level = 0;
        
        queue.add(root);
        
        while(queue.isEmpty() == false){
            int length = queue.size();
            List<Integer> l = new ArrayList<Integer>();
            list.add(l);    
            
            for(int i = 0; i < length; i++){
                TreeNode n = queue.remove();
                if(n.left != null){
                    queue.add(n.left);
                }
                
                if(n.right != null){
                    queue.add(n.right);
                }
                
                list.get(level).add(n.val);
            }
            
            level++;
        }
        
        
        
        return list;
    }
}