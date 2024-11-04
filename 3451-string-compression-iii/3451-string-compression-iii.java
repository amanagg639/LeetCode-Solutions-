class Solution {
    public String compressedString(String word) {
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<word.length(); i++){
            char c = word.charAt(i);
            int len = 1;
            while(i+1<word.length() && c == word.charAt(i+1) && len<9){
                len++;
                i++;
            }
            sb.append(len);
            sb.append(c);
        }
        return sb.toString();
    }
}