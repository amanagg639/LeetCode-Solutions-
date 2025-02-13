class Solution {
    public int[] applyOperations(int[] nums) {
        for(int i=0; i<nums.length-1; i++){
            if(nums[i] == nums[i+1]){
                nums[i] *= 2;
                nums[i+1] = 0;
            }
        }
        int index=0;
        for(int k : nums){
            if(k!=0){
                nums[index++] = k;
            }
        }
        while(index<nums.length){
            nums[index++] = 0;
        }
        return nums;
    }
}