class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        String ans = "";
        for(int i=0; i<s.length(); i++){
            char c= s.charAt(i);
            if(c != ' '){
                sb.append(c);
            }
            else{
                sb.reverse();
                ans += sb;
                ans += " ";
                sb = new StringBuilder();
            }
        }
        sb.reverse();
        ans += sb;
        return ans;
    }
}