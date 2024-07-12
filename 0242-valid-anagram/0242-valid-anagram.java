class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())return false;
        HashMap<Character, Integer> set1 = new HashMap<>();
        HashMap<Character, Integer> set2 = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            set1.put(s.charAt(i), set1.getOrDefault(s.charAt(i), 0)+1);
            set2.put(t.charAt(i), set2.getOrDefault(t.charAt(i), 0)+1);
        }
        if(set1.equals(set2))return true;
        else return false;
    }
}