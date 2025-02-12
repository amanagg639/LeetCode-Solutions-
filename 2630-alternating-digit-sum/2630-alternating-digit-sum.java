class Solution {
    public int alternateDigitSum(int n) {
        int cnt = 0;
        int temp = n;
        int sum = 0;
        while(temp>0){
            temp = temp/10;
            cnt++;
        }
        while(n>0){
            int lastDigit = n%10;
            if(cnt%2!=0){
                sum += lastDigit;
            }
            else{
                sum += -1*lastDigit;
            }
            cnt--;
            n = n/10;
        }
        return sum;
    }
}