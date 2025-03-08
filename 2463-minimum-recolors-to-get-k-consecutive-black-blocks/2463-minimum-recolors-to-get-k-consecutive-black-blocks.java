class Solution {
    public int minimumRecolors(String blocks, int k) {
        int minCnt = Integer.MAX_VALUE;
        for(int i=0; i<=blocks.length()-k; i++){
            int index = i;
            int cnt = 0;
            int j = 0;
            while(j<k){
               if(blocks.charAt(index++) == 'W'){
                cnt++;
               }
               j++;
            }
            minCnt = Math.min(cnt, minCnt);
        }
        return minCnt;
    }
}