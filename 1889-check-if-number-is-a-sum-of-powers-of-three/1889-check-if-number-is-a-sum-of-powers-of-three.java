class Solution {
    public boolean checkPowersOfThree(int n) {
        int start = 0;
        int i = 0;
        int prev = 0;
        while(start<n){
            prev = start;
            start = (int)Math.pow(3, i);
            i++;
        }
        if(n-start==0)return true;
        n = n-prev;
        i -= 3;
        while(i>=0){
            start = (int) Math.pow(3, i);
            if(start<=n){
                n = n-start;
            }
            i--;
        }
        if(n == 0)return true;
        else return false;
    }
}