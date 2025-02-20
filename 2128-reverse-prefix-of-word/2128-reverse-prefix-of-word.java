class Solution {
    public String reversePrefix(String word, char ch) {
         String newCh = "";
         int i=0;
         boolean flag = false;
         while(i<word.length()){
            if(word.charAt(i) == ch){
                flag = true;
                break;
            }
            i++;
         }
         if(flag == false)return word;
         int index=0;
         while(i>=0){
            newCh += word.charAt(i);
            i--;
            index++;
         }
         while(index<word.length()){
            newCh += word.charAt(index);
            index++;
        }
         return newCh;
    }
}