class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        int maxi = 0;
        for(int i=0; i<n; i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i])+1);
            }
            else{
            map.put(nums[i], 1);
            }
            if(map.get(nums[i])>n/2){
                maxi = nums[i];
                break;
            }
        }
        
       return maxi;
    }
}