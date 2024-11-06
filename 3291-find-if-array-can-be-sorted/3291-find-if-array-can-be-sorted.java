class Solution {
    public boolean canSortArray(int[] nums) {
        for(int i=0; i<nums.length-1; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i]>nums[j]){
                    if(Integer.bitCount(nums[i]) != Integer.bitCount(nums[j])){
                        return false;
                    }
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        return true;
    }
}