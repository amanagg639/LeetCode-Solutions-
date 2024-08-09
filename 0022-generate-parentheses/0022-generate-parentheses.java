class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        find(n, ans, "", n, n);
        return ans;
    }
    public void find(int n, List<String> ans, String temp, int r, int l){
         if(l==0 && r==0){
            ans.add(temp);
            return;
         }
         if(r>0)
         find(n, ans, temp+'(', r-1, l);
         if(l>r)
         find(n, ans, temp+')', r, l-1);
    }
}