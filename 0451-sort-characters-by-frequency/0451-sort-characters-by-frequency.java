class Pair{
    int a;
    char b;
    Pair(int a, char b){
        this.a = a;
        this.b = b;
    }
}
class Solution {
    public String frequencySort(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        PriorityQueue<Pair> pq = new PriorityQueue<>((p1, p2) -> p2.a - p1.a);
        for(int i=0; i<s.length(); i++){
           // map.put(s.charAt(i), map.getOrDefault(s.charAt(i))+1);
           if(map.containsKey(s.charAt(i))){
            map.put(s.charAt(i), map.get(s.charAt(i))+1);
           }
           else{
            map.put(s.charAt(i), 1);
           }
        }
        for(var i : map.keySet()){
            pq.add(new Pair(map.get(i), i));
        }
        String p = "";
        while(pq.size()>0){
            int cnt = pq.peek().a;
            while(cnt>0){
                p += pq.peek().b;
                cnt--;
            }
            pq.remove();
        }
        return p;
    }
}