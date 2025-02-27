class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int n = p.length();
        List<Integer> ls =  new ArrayList<>();
        char c1[] = p.toCharArray();
        Arrays.sort(c1);
        char c2[] = new char[p.length()];
        for(int i=0; i<=s.length()-n; i++){
            int index = 0;
            int j = i;
            while(index<p.length()){
                c2[index++] = s.charAt(j++);
            }
            Arrays.sort(c2);
            if(Arrays.equals(c1, c2)){
                ls.add(i);
            }
        }
        return ls;
    }
}
