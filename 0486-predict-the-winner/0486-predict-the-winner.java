class Solution {
    public boolean predictTheWinner(int[] nums) {
        int n = nums.length;
        int sum = 0;
        for(int i : nums){
            sum += i;
        }
        int p1 = solve(0, n-1, nums);
        int p2 = sum-p1;
        return p1>=p2;
    }
    public int solve(int i, int j, int[] nums){
        if(i>j){
            return 0;
        }
        if(i==j){
            return nums[i];
        }
        int c1 = nums[i] + Math.min(solve(i+2, j, nums), solve(i+1, j-1, nums));
        int c2 = nums[j] + Math.min(solve(i, j-2, nums), solve(i+1, j-1, nums));

        return Math.max(c1, c2);
    }
}