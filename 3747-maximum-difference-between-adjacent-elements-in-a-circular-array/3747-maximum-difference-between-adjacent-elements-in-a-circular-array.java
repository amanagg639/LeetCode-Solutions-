class Solution {
    public int maxAdjacentDistance(int[] nums) {
        int max = Math.abs(nums[nums.length-1]-nums[0]);
        for(int i=1; i<nums.length; i++){
            int diff = Math.abs(nums[i] - nums[i-1]);
            max = Math.max(diff, max);
        }
        return max;
    }
}