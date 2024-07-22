class Solution {
   
    public static void solve(int ind, int arr[], int n, 
    List<Integer> out, List<List<Integer>> subset){
        if (ind>=n) {
            Collections.sort(out);
            if (!subset.contains(out)) {
               subset.add(out);   
            }     
            return;
        }
        solve(ind+1, arr, n, new ArrayList<>(out), subset);
        int temp = arr[ind];
        out.add(temp);
        solve(ind+1, arr, n, new ArrayList<>(out), subset);
        out.remove(out.size()-1);
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        int n = nums.length;
        List<List<Integer>> subset = new ArrayList<>();
        List<Integer> out = new ArrayList<>();
        solve(0, nums, n, out, subset);
        return subset;
    }
}