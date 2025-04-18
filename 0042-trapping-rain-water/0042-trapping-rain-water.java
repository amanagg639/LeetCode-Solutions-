class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int l = 0;
        int r = n-1;
        int lMax = 0, rMax = 0;
        int res = 0;
        while(l<=r){
            if(height[l]<=height[r]){
                if(height[l]>=lMax)lMax = height[l];
                else{
                    res += lMax - height[l];
                }
                l++;
            }
            else{
                if(height[r]>=rMax)rMax = height[r];
                else{
                    res += rMax - height[r];
                }
                r--;
            }
        }
        return res;
    }
}