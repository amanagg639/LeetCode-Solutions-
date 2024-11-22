class Solution {
    public int maxEqualRowsAfterFlips(int[][] matrix) {
        Map<String, Integer> map = new HashMap<>();
        for(int row[] : matrix){
            StringBuilder st = new StringBuilder();
            StringBuilder flip = new StringBuilder();

            for(int r: row){
                st.append(r);
                flip.append(1-r);
            }
            String str = st.toString();
            String ft = flip.toString();
            map.put(str, map.getOrDefault(str, 0)+1);
            map.put(ft, map.getOrDefault(ft, 0)+1);
        }
        int max = 0;
        for(int c : map.values()){
            max = Math.max(max, c);
        }
        return max;
    }
}