class Solution {
    public int largestAltitude(int[] gain) {
        int max = 0;
        int ind = 0;
        for(int i=0; i<gain.length; i++){
            ind += gain[i];
            if(ind>max){
                max = ind;
            }
        }
        return max;
    }
}