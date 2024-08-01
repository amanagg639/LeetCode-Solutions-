class Solution {
    public int orangesRotting(int[][] grid) {
        Queue<int[]> q = new LinkedList<>();
        int cntfresh = 0;
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                if(grid[i][j] == 2){
                    q.offer(new int[]{i, j});
                }
                if(grid[i][j] != 0){
                    cntfresh++;
                }
            }
        }
        if(cntfresh == 0)return 0;
        int cnt = 0;
        int cntMin = 0;
        int dx[] = {0, 0, 1, -1};
        int dy[] = {1, -1, 0, 0};
        while(!q.isEmpty()){
            int size = q.size();
            cnt += size;
            for(int i=0; i<size; i++){
                int[] point = q.poll();
                for(int j=0; j<4; j++){
                    int x = point[0] + dx[j];
                    int y = point[1] + dy[j];
                
                if(x<0 || y<0 || x>=grid.length || y>=grid[0].length || grid[x][y] == 0 || grid[x][y] ==2)continue;
                grid[x][y] = 2;
                q.offer(new int[]{x, y});
                }
            }
            if(!q.isEmpty())cntMin++;
        }
        return cntfresh == cnt ? cntMin : -1;
    }
    
}