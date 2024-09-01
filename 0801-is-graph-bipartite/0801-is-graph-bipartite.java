class Solution {
    public boolean isBipartite(int[][] graph) {
        int n = graph.length;
        int[] color = new int[n];
        Arrays.fill(color, -1);
        for(int i=0; i<n; i++){
            if(color[i] == -1){
                if(dfs(i, color, graph, 0) == false) return false;
            }
        }
        return true;
    }
    public boolean dfs(int node, int[] color, int[][]graph, int prev){
         color[node] = prev;
         for(int i=0; i<graph[node].length; i++){
            int nd = graph[node][i];
            if(color[nd] == -1){
                if(dfs(nd, color, graph, 1-prev) == false)return false;
            }
            else if(color[node] == color[nd])return false;
        }
        return true; 
    }
}