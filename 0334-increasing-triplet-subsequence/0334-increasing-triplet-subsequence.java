class Solution {
    public boolean increasingTriplet(int[] nums) {
         int sm = Integer.MAX_VALUE;
         int mid = Integer.MAX_VALUE;
         for(int i : nums){
            if(i>mid)return true;
            if(i <= sm){
                sm = i;
            }
            else{
                mid = i;
            }
            
         }
         return false;
         
    }
}