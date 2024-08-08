class Solution {
    
    public String countAndSay(int n) {
        if(n==1)return "1";
        String s = "1";
        for(int i=1; i<n; i++){
        StringBuilder sb = new StringBuilder();
        int j = 0;
        while(j<s.length()){
            int cnt = 0;
            char c = s.charAt(j);
            while(j<s.length() && s.charAt(j) == c){
                cnt++;
                j++;
            }
            sb.append(String.valueOf(cnt));
            sb.append(c);
        }
        s = sb.toString();
        }
        return s;
    }
}