class Solution {
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        int[][] dp = new int[n][n+1];
        for(int[] row : dp){
        Arrays.fill(row, -1);
        }
        return getAns(nums, dp, 0, -1);
        
    }
    public int getAns(int[] nums, int[][] dp, int ind, int prevInd){
        if(ind == nums.length)return 0;
        if(dp[ind][prevInd + 1] != -1)return dp[ind][prevInd + 1];

        int nottake = 0 + getAns(nums, dp, ind+1, prevInd);

        int take = 0;
        if(prevInd == -1 || nums[ind]>nums[prevInd]){
            take = 1 + getAns(nums, dp, ind+1, ind);
        }
        return dp[ind][prevInd + 1] = Math.max(take, nottake);
    }
}