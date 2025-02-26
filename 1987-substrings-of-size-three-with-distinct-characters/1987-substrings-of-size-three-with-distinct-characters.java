class Solution {
    public int countGoodSubstrings(String s) {
        int cnt = 0;
        for(int i=0; i<s.length()-2; i++){
            char a = s.charAt(i), b = s.charAt(i+1), c = s.charAt(i+2);
            if(a!=b && b!=c && c!=a)cnt++;
        }
        return cnt;
    }
}