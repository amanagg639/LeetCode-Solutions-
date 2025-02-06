class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int before = 1;
        int after = 1;
        int[] res = new int[n];                                                                                                                                                                                                                                                                                                                                                                             
        for(int i=0; i<n; i++){
           res[i] = before;
           before *= nums[i];
        }
        for(int i=n-1; i>=0; i--){
            res[i] *= after;
            after *= nums[i];
        }
        return res;
    }
}