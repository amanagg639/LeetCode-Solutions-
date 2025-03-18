class Solution {
    public int[] frequencySort(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        }
        List<Integer> list = new ArrayList<>();
        for (int num : nums) {
            list.add(num);
        }
        list.sort((a,b) -> {
            int freqA = map.get(a);
            int freqB = map.get(b);
            if(freqA == freqB){
                return b - a;
            }
            return freqA - freqB;
        });
        for (int i = 0; i < nums.length; i++) {
            nums[i] = list.get(i);
        }
        return nums;
    }
}