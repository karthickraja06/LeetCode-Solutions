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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if(root == null)return res;
        Queue<List<TreeNode>> queue = new LinkedList<>();
        queue.add(new ArrayList<>(Collections.singletonList(root)));

        while(!queue.isEmpty()){
            List<TreeNode> temp = queue.poll();
            List<Integer> value = new ArrayList<>();
            List<TreeNode> sub = new ArrayList<>();
            for(TreeNode i:temp){
                value.add(i.val);
                if(i.left != null){
                    sub.add(i.left);
                }
                if(i.right != null){
                    sub.add(i.right);
                }
            }
            if(!sub.isEmpty())queue.add(sub);
            if(!value.isEmpty())res.add(value);
            System.out.println(queue);
        }
        return res;
    }
}