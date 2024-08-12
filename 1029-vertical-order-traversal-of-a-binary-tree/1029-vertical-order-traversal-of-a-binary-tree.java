/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    TreeMap<Integer, TreeMap<Integer, List<Integer>>> map = new TreeMap<>();
    public List<List<Integer>> verticalTraversal(TreeNode root) {
       List<List<Integer>> res = new ArrayList<>();
       if(root == null)return res;
       dfs(root, 0, 0);
       for(Map.Entry<Integer, TreeMap<Integer, List<Integer>>> entry : map.entrySet()){
           TreeMap<Integer, List<Integer>> lmap = entry.getValue();
           List<Integer> ls = new ArrayList<>();
           for(Map.Entry<Integer, List<Integer>> subEntry : lmap.entrySet()){
              List<Integer> subls = subEntry.getValue();
              Collections.sort(subls);
              ls.addAll(subls);
           }
           res.add(ls);
       }
       return res;
    }
    public void dfs(TreeNode root, int col, int lvl){
        if(root == null)return;

        if(!map.containsKey(col)){
            map.put(col, new TreeMap<>());
        }
        if(!map.get(col).containsKey(lvl)){
            map.get(col).put(lvl, new ArrayList<>());
        }
        map.get(col).get(lvl).add(root.val);
        
        dfs(root.left, col-1, lvl+1);
        dfs(root.right, col+1, lvl+1);
    }
}