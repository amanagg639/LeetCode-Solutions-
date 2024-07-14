class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        for(int i=0; i<m; i++){
            if(target>matrix[i][n-1])continue;
            int l = 0;
            int r = n-1;
            while(l<=r){
                int mid = (l+r)/2;
                if(matrix[i][mid] == target){
                    return true;
                }
                if(matrix[i][mid] > target){
                    r = mid-1;
                }
                else{
                    l = mid+1;
                }
            }
        }
        return false;
    }
}