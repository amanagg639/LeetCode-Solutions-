class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int ans[] = new int[queries.length];
        for(int i=0; i<words.length; i++){
            if(check(words[i])){
                sum++;
            }
                map.put(i, sum);
        }
        for(int i=0; i<queries.length; i++){
            int ind1 = queries[i][0];
            int ind2 = queries[i][1];
            if(check(words[ind1])){
                ans[i] = map.get(ind2)-map.get(ind1)+1;
            }
            else ans[i] = map.get(ind2)-map.get(ind1);
        }
        return ans;
    }
    public boolean check(String str){
        String vowel = "aeiou";
        String first = "";
        first += str.charAt(0);
        String last = "";
        last += str.charAt(str.length()-1);
        if(vowel.contains(first) && vowel.contains(last))
        return true;
        else return false;
    }
}