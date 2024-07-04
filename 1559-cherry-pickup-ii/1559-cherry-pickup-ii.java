class Solution {
    public int findAns(int i, int j1, int j2, int n, int m, int grid[][], int dp[][][]){
        if(j1<0 || j1>=m || j2<0 || j2>=m)return (int)Math.pow(-10, 9);
        if(i==n-1){
            if(j1 == j2)return grid[i][j1];
            else return grid[i][j1] + grid[i][j2];
        }
        if(dp[i][j1][j2] != -1) return dp[i][j1][j2];
        int maxi = (int)Math.pow(-10, 9);
        for(int d1 = -1; d1<=1; d1++){
            for(int d2=-1; d2<=1; d2++){
               int val = 0;
               if(j1==j2) val = grid[i][j1];
               else{
                   val= grid[i][j1] + grid[i][j2];

               }
               val += findAns(i+1, j1+d1, j2+d2, n, m, grid, dp);
               maxi = Math.max(maxi, val);
            }
        }
        return dp[i][j1][j2] = maxi;
    }
    public int cherryPickup(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int[][][] dp = new int[n][m][m];
        for(int row[][] : dp){
            for(int row1[] : row){
                Arrays.fill(row1, -1);
            }
        }
        return findAns(0, 0, m-1, n, m, grid, dp);
    }
}