class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] map =  new int[26];
        int diffCnt = 0;
        if(s2.length()<s1.length())return false;
        for(int i=0; i<s1.length(); i++){
           map[s1.charAt(i)-'a']++;
           map[s2.charAt(i)-'a']--;
        }
        for(int diff : map){
            if(diff > 0)diffCnt++;
        }
        if(diffCnt == 0)return true;
        int n = s2.length()-s1.length();
        for(int i=0; i<n; i++){
            if(++map[s2.charAt(i) - 'a'] == 1 )diffCnt++;
            if(--map[s2.charAt(i+s1.length()) - 'a'] == 0) diffCnt--;
            if(diffCnt == 0)return true;
        }
        return false;
    }
}