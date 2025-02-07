class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int evenIndex = 0, oddIndex = 1;
        int[] arr = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            if(nums[i]%2==0){
                arr[evenIndex] = nums[i];
                evenIndex += 2;
            }
            else{
                arr[oddIndex] = nums[i];
                oddIndex += 2;
            }
        }
        return arr;
    }
}