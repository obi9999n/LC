class Solution {
    
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        //create answer list
        List<List<Integer>> answer = new ArrayList<>();
        
        List<Integer> path = new ArrayList<>();
        
        path.add(0);
        for(int n: graph[0]){
            dfs(n, graph, path, answer);
        }
            
        return answer;
        
    }
    
    public void dfs(int n, int[][] graph, List<Integer> path, List<List<Integer>> answer){
        path.add(n);
        if(n == graph.length - 1){
            answer.add(new ArrayList(path));
        } else {
            for(int node: graph[n]){
                dfs(node, graph, path, answer);
            }
        }
        path.remove(path.size() - 1);
    }
}