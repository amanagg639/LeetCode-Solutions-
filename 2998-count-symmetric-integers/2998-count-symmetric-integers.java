class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int cnt = 0;
        for(int ind=low; ind<=high; ind++){
            String s = String.valueOf(ind);
            int n = s.length();
            int sum1 = 0;
            int sum2 = 0;
            if(n%2==0){
               int i=0;
               int j=n/2;
               while(i<n/2 && j<n){
                sum1 += s.charAt(i++) - '0';
                sum2 += s.charAt(j++) - '0';
               }
               if(sum1 == sum2)cnt++;
            }
        }
        return cnt;
    }
}