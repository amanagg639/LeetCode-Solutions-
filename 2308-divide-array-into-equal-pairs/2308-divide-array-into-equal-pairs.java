class Solution {
    public boolean divideArray(int[] nums) {
        if(nums.length%2!=0)return false;
        int n = nums.length/2;
        HashMap<Integer, Integer> map = new HashMap<>();
        int cnt = 0;
        for(int i : nums){
            if(map.containsKey(i)){
               cnt++;
               map.remove(i);
            }
            else{
                map.put(i, 1);
            }
        }
        if(cnt==n)return true;
        else return false;
    }
}