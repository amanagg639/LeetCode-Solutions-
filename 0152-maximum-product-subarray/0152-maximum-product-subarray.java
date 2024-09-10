class Solution {
    public int maxProduct(int[] nums) {
        int ans = Integer.MIN_VALUE;
        int p = 1;
        int s = 1;
        for(int i=0; i<nums.length; i++){
            if(p==0){
                p = 1;
            }
            if(s == 0){
                s = 1;
            }
            p *= nums[i];
            s *= nums[nums.length - i - 1];
            ans = Math.max(ans, Math.max(p, s));
        }
        return ans;
    }
}