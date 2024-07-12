class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
         HashMap<String, List<String>> map = new HashMap<>();
         for(int i=0; i<strs.length; i++){
            char [] ch = strs[i].toCharArray();
            Arrays.sort(ch);
            String s = new String(ch);
            map.put(s, map.getOrDefault(s, new ArrayList<String>()));
            map.get(s).add(strs[i]);
         }
         List<List<String>> ls = new ArrayList<>();
         for(Map.Entry<String, List<String>> entry : map.entrySet()){
            ls.add(entry.getValue());
         }
         return ls;
    }
}