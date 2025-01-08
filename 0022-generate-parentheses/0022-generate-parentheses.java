class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        genrate(0, 0, n, new StringBuilder(), ans);
        return ans;
    }
    public void genrate(int open, int close, int n, StringBuilder str, List<String>ans){
        if(str.length() == n*2){
            ans.add(str.toString());
            return;
        }
        if(open<n){
            str.append('(');
            genrate(open+1, close, n, str, ans);
            str.deleteCharAt(str.length()-1);
        }
        if(close<open){
            str.append(')');
            genrate(open, close+1, n, str, ans);
            str.deleteCharAt(str.length()-1);
        }
    }
}