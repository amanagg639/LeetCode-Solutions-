class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        char[] ch = strs[0].toCharArray();
        char[] ch2 = strs[strs.length-1].toCharArray();
        int len = Math.min(ch.length, ch2.length);
        String ans = "";
        for(int i=0; i<len; i++){
            if(ch[i] == ch2[i])ans += ch[i];
            else break;
        }
        return ans;
    }
}