class Solution {
    public int[] rearrangeArray(int[] nums) {
        int i=0; 
        int j=i+1;
        int arr[] = new int[nums.length];
        for(int num : nums){
            if(num>0){
                arr[i] = num;
                i += 2;
            }
            else{
                arr[j] = num;
                j += 2;
            }
        }
        return arr;
    }
}