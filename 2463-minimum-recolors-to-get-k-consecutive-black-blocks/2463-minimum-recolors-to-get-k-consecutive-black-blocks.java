class Solution {
    public int minimumRecolors(String blocks, int k) {
        int minOperations = 0, operations = 0;
        for(int i=0; i<k; i++){
            if(blocks.charAt(i) == 'W'){
                operations++;
            }
        }
        minOperations = operations;
        for(int i=k; i<blocks.length(); i++){
            if(blocks.charAt(i-k) == 'W')operations--;
            if(blocks.charAt(i) == 'W')operations++;
            minOperations = Math.min(minOperations, operations);
        }
        return minOperations;
    }
}