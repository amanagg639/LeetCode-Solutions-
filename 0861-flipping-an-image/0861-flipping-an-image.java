class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        for(int[]arr : image){
            reverse(arr);
            for(int i=0; i<arr.length; i++){
                if(arr[i]==0)arr[i] = 1;
                else arr[i] = 0;
            }
        }
        return image;
    }
    public void reverse(int[]arr){
        int i=0;
        int j=arr.length-1;
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}