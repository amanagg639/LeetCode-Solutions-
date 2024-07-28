class Solution {
    public int[] topKFrequent(int[] nums, int k) {
       Map<Integer, Integer> map = new HashMap<>();
       for(int n : nums){
        map.put(n, map.getOrDefault(n, 0)+1);
       }
       PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>((a, b) -> a.getValue() - b.getValue());

       for(Map.Entry<Integer, Integer> entry : map.entrySet()){
          pq.add(entry);
          if(pq.size() > k){
            pq.poll();
          }
       }
       int []ans = new int[k];
       int i = 0;
       while(!pq.isEmpty()){
            ans[i] = pq.poll().getKey();
            i++;
       }
       return ans;
    }
}