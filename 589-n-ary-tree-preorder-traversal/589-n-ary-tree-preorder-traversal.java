/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<Integer> preorder(Node root) {
        List<Integer> list = new ArrayList<Integer>();
        helper(root, list);
        return list;
    }
    
    public void helper(Node node, List<Integer> nodeList){
        if (node == null) return;
        nodeList.add(node.val);
        for(Node n: node.children){
            helper(n, nodeList);
        }
    }
}