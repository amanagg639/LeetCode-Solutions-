class Solution {
    public String makeFancyString(String s) {
        int n = s.length();
        StringBuilder sb = new StringBuilder();
        sb.append(s.charAt(0));
        int cnt = 1;
        for(int i=1; i<n; i++){
            if(s.charAt(i) == sb.charAt(sb.length() - 1)){
                cnt++;
                if(cnt<3){
                    sb.append(s.charAt(i));
                }
            }
            else{
                cnt = 1;
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}