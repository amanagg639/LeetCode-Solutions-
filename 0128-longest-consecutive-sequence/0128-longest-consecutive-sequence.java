class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        if(n==0){
            return 0;
        }
        Set<Integer> set = new HashSet<>();
        int longest = 1;
        for(int i=0; i<n; i++){
            set.add(nums[i]);
        }

        for(int it : set){
            if(!set.contains(it-1)){
                int cnt = 1;
                int x = it;
                while(set.contains(x+1)){
                    x += 1;
                    cnt += 1;
                }
                longest = Math.max(longest, cnt);
            }
        }
        return longest;
    }
}