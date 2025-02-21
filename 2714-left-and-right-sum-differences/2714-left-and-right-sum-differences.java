class Solution {
    public int[] leftRightDifference(int[] nums) {
        int sum = 0;
        int ans[] = new int[nums.length];
        int index = 0;
        for(int i : nums){
            ans[index++] = sum;
            sum += i;
        }
        sum = 0;
        for(int i=nums.length-1; i>=0; i--){
            int diff = Math.abs(ans[i]-sum);
            ans[i] = diff;
            sum += nums[i];
        }
        return ans;
    }
}