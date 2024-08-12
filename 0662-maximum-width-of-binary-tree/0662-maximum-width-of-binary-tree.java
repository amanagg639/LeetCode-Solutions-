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
class Pair{
    TreeNode node;
    int num;
    Pair(TreeNode node, int num){
        this.node = node;
        this.num = num;
    }
}
class Solution {

    public int widthOfBinaryTree(TreeNode root) {
        if(root == null)return 0;
        Queue<Pair> que = new LinkedList<>();
        que.offer(new Pair(root, 0));
        int max = 0;
        while(!que.isEmpty()){
            int n = que.size();
            int min = que.peek().num;
            int first = 0, last = 0;
            for(int i=0; i<n; i++){
                int curr = que.peek().num - min;
                if(i==0)first = curr;
                if(i==n-1)last = curr;
                TreeNode r = que.poll().node;
                if(r.left!=null)que.offer(new Pair(r.left, 2*curr+1));
                if(r.right!=null)que.offer(new Pair(r.right, 2*curr+2));
            }
            max = Math.max(max, last-first+1);
        }
        return max;
    }
}