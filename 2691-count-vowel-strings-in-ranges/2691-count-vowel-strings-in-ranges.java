class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
        int[] prefixSum = new int[words.length+1];
        for(int i=0; i<words.length; i++){
            prefixSum[i+1] = prefixSum[i] + (isVowel(words[i]) ? 1 : 0);
        }
        int ans[] = new int[queries.length];
        for(int i=0; i<ans.length; i++){
            int first=queries[i][0];
            int last = queries[i][1];
            ans[i] = prefixSum[last+1] - prefixSum[first];
        }
        return ans;
    }
    public boolean isVowel(String str){
        return vowel(str.charAt(0)) && vowel(str.charAt(str.length()-1));
    }
    public boolean vowel(char c){
        return "aeiou".indexOf(c) != -1;
    }
}