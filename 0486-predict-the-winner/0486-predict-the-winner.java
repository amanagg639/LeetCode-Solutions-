class Solution {
    public boolean predictTheWinner(int[] nums) {
        int n = nums.length;
        int sum = 0;
        int[][] dp = new int[n+1][n+1];
        for(int[] i : dp){
            Arrays.fill(i, -1);
        }
        for(int i : nums){
            sum += i;
        }
        int p1 = solve(0, n-1, nums, dp);
        int p2 = sum-p1;
        return p1>=p2;
    }
    public int solve(int i, int j, int[] nums, int[][]dp){
        if(i>j){
            return 0;
        }
        if(i==j){
            return nums[i];
        }
        if(dp[i][j] != -1)return dp[i][j];
        int c1 = nums[i] + Math.min(solve(i+2, j, nums, dp), solve(i+1, j-1, nums, dp));
        int c2 = nums[j] + Math.min(solve(i, j-2, nums, dp), solve(i+1, j-1, nums, dp));

        return dp[i][j] = Math.max(c1, c2);
    }
}