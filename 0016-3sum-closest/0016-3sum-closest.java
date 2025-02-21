class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);

        int minDiff = Integer.MAX_VALUE, ans = -1;

        for (int i = 0; i < nums.length - 2; i++) {
            int j = i + 1, k = nums.length - 1;

            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];

                if (Math.abs(sum - target) < minDiff) {
                    minDiff = Math.abs(sum - target);
                    ans = sum;
                }

                if (sum > target) {
                    k--;
                } else if (sum < target) {
                    j++;
                } else {
                    return sum;
                }
            }
        }

        return ans;
    }
}