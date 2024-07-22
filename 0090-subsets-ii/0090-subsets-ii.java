class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();
        backtrack(list, nums, new ArrayList<>(), 0);
        return list;
    }
    private void backtrack(List<List<Integer>> list, int[] nums, List<Integer> path, int index){
        list.add(new ArrayList<>(path));
        for(int i=index; i<nums.length; i++){
            if(i>index && nums[i] == nums[i-1]){
                continue;
            }
            path.add(nums[i]);
            backtrack(list, nums, path, i+1);
            path.remove(path.size()-1);
        }
    }
}