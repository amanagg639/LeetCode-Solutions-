class Solution {
    public boolean isPalindrome(String s) {
        String newS = s.toLowerCase();
        String res = "";
        for(int i=0; i<newS.length(); i++){
            int c = (int)newS.charAt(i);
            if(c>=97 && c<123 || c>='0' && c<='9'){
            res += newS.charAt(i);
            } 
        }
        return checkPalindrome(res);
    }
    public boolean checkPalindrome(String res){
        int i=0;
        int j=res.length()-1;
        while(i<=j){
            if(res.charAt(i++)!=res.charAt(j--))return false;
        }
        return true;
    }
}