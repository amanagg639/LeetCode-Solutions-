class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int i=0;
        int j=i+1;
        while(i<nums.length && j<nums.length){
           if(nums[i]%2!=0 && nums[j]%2==0){
              int temp = nums[i];
              nums[i] = nums[j];
              nums[j] = temp;
              i += 2;
              j += 2;
           }
           else if(nums[i]%2==0 && nums[j]%2==0){
              i += 2;
           }
           else if(nums[i]%2!=0 && nums[j]%2!=0){
              j += 2;
           }
           else{
            i += 2;
            j += 2;
           }
 
        }
        return nums;
    }
}