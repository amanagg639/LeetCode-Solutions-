class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int size = grid.length*grid.length+1;
        int arr[] = new int[size];
        int a = 0;
        int b = 0;
        for(int array[] : grid){
            for(int i : array){
                if(arr[i] == 1){
                    a = i;
                }
                arr[i] = 1;
            }
        }
        for(int i=1; i<size; i++){
            if(arr[i]==0){
               b = i;
                break;
            }
        }
        return new int[]{a, b};
    }
}