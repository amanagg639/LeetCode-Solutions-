class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int arr[] = new int[nums.length];
        int cnt = 0;
        for(int i : nums){
            if(i<pivot)
            arr[cnt++] = i;
        }
        for(int i : nums){
            if(i==pivot)
            arr[cnt++] = i;
        }
        for(int i : nums){
            if(i>pivot)
            arr[cnt++] = i;
        }
        return arr;
    }
}