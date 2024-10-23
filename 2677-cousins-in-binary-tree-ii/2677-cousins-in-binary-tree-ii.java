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
 //
class Pair{
    TreeNode node;
    int val;
    Pair(TreeNode node, int val){
        this.node = node;
        this.val = val;
    }
} 
class Solution {
    public TreeNode replaceValueInTree(TreeNode root) {
        ArrayList<Integer> level_sum = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            int sum = 0;
            int n = q.size();
            for(int i=0; i<n; i++){
                TreeNode node = q.remove();
                sum += node.val;
                if(node.left != null)q.offer(node.left);
                if(node.right != null)q.offer(node.right);
            }
            level_sum.add(sum);
        }
        Queue<Pair> que = new LinkedList<>();
        int level = 0;
        que.offer(new Pair(root, root.val));
        while(!que.isEmpty()){
            int n = que.size();
            for(int i=0; i<n; i++){
                int val = que.peek().val;
                TreeNode node = que.peek().node;
                que.remove();
                node.val = level_sum.get(level) - val;
                int childSum = 0;
                if(node.left != null) childSum += node.left.val;
                if(node.right != null)childSum += node.right.val;
                if(node.left != null)que.offer(new Pair(node.left, childSum));
                if(node.right != null)que.offer(new Pair(node.right, childSum));
            }
            level++;
        }
        return root;
    }
}
