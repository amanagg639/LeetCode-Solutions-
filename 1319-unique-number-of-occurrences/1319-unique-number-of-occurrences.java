class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> map1 = new HashMap<>();
        for(int i : arr){
            map1.put(i, map1.getOrDefault(i, 0)+1);
        }
        HashMap<Integer, Integer> map2 = new HashMap<>();
        for(Map.Entry<Integer, Integer>set : map1.entrySet()){
            if(map2.containsKey(set.getValue()))return false;
            map2.put(set.getValue(), 1);
        }
        return true;
    }
}