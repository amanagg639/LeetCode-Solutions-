class Solution {
    public int repeatedStringMatch(String a, String b) {
        String st = "";
        int cnt = 0;
        while(st.length()<= (a.length()+b.length())){
            st += a;
            cnt++;

            if(st.contains(b))return cnt;
                    }
        return -1;
    }
}