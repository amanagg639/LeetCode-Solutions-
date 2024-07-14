class Solution {
    public int findAns(int m, int n, int[][]dp){
        if(m==0 || n==0)return 1;
        if(m<0 || n<0)return 0;
        if(dp[m][n] != -1)return dp[m][n];

        int left = findAns(m-1, n, dp);
        int up = findAns(m, n-1, dp);
        
        return dp[m][n] = left+up;
    }
    public int uniquePaths(int m, int n) {
        int dp[][] = new int[m][n];
        for(int[] i : dp){
            Arrays.fill(i, -1);
        }
        int ans = findAns(m-1, n-1, dp);
        return ans;
    }
}