class Solution {
    public int removeStones(int[][] stones) {
        int n = stones.length;
        boolean []visit = new boolean[n];
        int group = 0;
        for(int i=0; i<n; i++){
            if(visit[i] == true)
            continue;

            dfs(stones, i, visit);
            group++;
        }
        return n-group;
    }
    public void dfs(int[][] stones, int ind, boolean []visit){
        visit[ind] = true;
        for(int i=0; i<stones.length; i++){
            int r = stones[ind][0];
            int c = stones[ind][1];
            if((visit[i] == false) && (stones[i][0] == r || stones[i][1] == c)){
                dfs(stones, i, visit);
            }
        }
    }
}