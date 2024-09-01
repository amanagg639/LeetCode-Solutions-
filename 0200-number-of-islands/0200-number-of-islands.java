class Pair{
    int row;
    int col;
    Pair(int row, int col){
        this.row = row;
        this.col = col;
    }
}
class Solution {
    public int numIslands(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int[][] vis = new int[n][m];
        int cnt = 0;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(grid[i][j] == '1' && vis[i][j] == 0){
                    cnt++;
                    bfs(i, j, grid, vis);
                }
            }
        }
        return cnt;
    }
    public void bfs(int i, int j, char[][] grid, int[][] vis){
        vis[i][j] = 1;
        Queue<Pair> que = new LinkedList<>();
        que.offer(new Pair(i, j));
        while(!que.isEmpty()){
            int row = que.peek().row;
            int col = que.peek().col;
            que.remove();
            int delrow[] = {-1, 0, +1, 0}; 
            int delcol[] = {0, -1, 0, +1};
            for(int di = 0; di<4; di++){
                    int nrow = row + delrow[di];
                    int ncol = col + delcol[di];
                    if(nrow>=0 && nrow<grid.length && ncol>=0 && ncol<grid[0].length && vis[nrow][ncol] == 0 && grid[nrow][ncol] == '1'){
                        vis[nrow][ncol] = 1;
                        que.offer(new Pair(nrow, ncol));
                    }
            }
        }
    }
}