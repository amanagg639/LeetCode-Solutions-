class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int[] ans = new int[nums.length];
        for(int i=0; i<index.length; i++){
            int ind = index[i];
            int num = nums[i];
            insert(ind, num, ans, i);
        }
        return ans;

    }
    public void insert(int ind, int num, int[]arr, int i){

        while(i<arr.length && i>ind && i-1>=0){
            arr[i] = arr[i-1];
            i--;
        }
        arr[ind] = num;
        
    }
}