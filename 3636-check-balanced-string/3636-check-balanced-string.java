class Solution {
    public boolean isBalanced(String num) {
        int evenSum = 0;
        int oddSum = 0;
        int i = 0;
        while(i<num.length()){
            evenSum += (int)num.charAt(i++) - '0';
            if(i<num.length()){
            oddSum += (int)num.charAt(i++) - '0';
            }
        }
        if(evenSum == oddSum)return true;
        else return false;
    }
}