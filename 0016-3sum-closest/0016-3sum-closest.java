class Solution {
    public int threeSumClosest(int[] arr, int target) {
        Arrays.sort(arr);
        int closest = Integer.MAX_VALUE;
        for (int index = 0; index < arr.length - 2; index++) {
            
            int i = index + 1;
            int j = arr.length - 1;
            while (i < j) {
                int sum = arr[index] + arr[i] + arr[j];
                if (Math.abs(sum - target) < Math.abs(closest - target)) {
                    closest = sum;
                }  if (sum > target) {
                    j--;
                } else
                    i++;
            }
        }
        return closest;
    }
}