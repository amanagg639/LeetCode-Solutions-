class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        int [][]merge = new int[nums1.length + nums2.length][2];
        int i=0;
        int j=0;
        int cnt = 0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i][0] == nums2[j][0]){
                merge[cnt][0] = nums1[i][0];
                merge[cnt][1] = nums1[i][1] + nums2[j][1];
                cnt++;
                i++;
                j++;
            }
            else if(nums1[i][0] < nums2[j][0]){
                merge[cnt][0] = nums1[i][0];
                merge[cnt][1] = nums1[i][1];
                cnt++;
                i++;
            }
            else{
                merge[cnt][0] = nums2[j][0];
                merge[cnt][1] = nums2[j][1];
                cnt++;
                j++;
            }
        }
        while(i<nums1.length){
            merge[cnt][0] = nums1[i][0];
            merge[cnt][1] = nums1[i][1];
            cnt++;
            i++;
        }
        while(j<nums2.length){
            merge[cnt][0] = nums2[j][0];
            merge[cnt][1] = nums2[j][1];
            cnt++;
            j++;
        }
        return Arrays.copyOfRange(merge, 0, cnt);         
    }
}