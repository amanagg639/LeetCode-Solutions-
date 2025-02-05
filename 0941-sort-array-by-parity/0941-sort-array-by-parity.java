class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int i=0;
        int j=i+1;
        while(j<nums.length){
            if(nums[i]%2 != 0 && nums[j]%2 == 0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
                j++;
            }
            else if(nums[i]%2 != 0 && nums[j]%2 != 0){
                j++;
            }
            else{
                i++;
                j++;
            }


        }
        return nums;
    }
}