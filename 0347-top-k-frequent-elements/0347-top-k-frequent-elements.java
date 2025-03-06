class MapValues{
    int k;
    int v;
    MapValues(int k, int v){
        this.k = k;
        this.v = v;
    }
}

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i : nums){
            map.put(i, map.getOrDefault(i, 0)+1);
        }
        PriorityQueue<MapValues> que = new PriorityQueue<>((a,b) -> b.v-a.v);
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            que.add(new MapValues(entry.getKey(), entry.getValue()));
        }
        int ans[] = new int[k];
        int i=0;
        while(k>0){
            ans[i++] = que.peek().k;
            que.poll();
            k--;
        }
        return ans;
    }
}