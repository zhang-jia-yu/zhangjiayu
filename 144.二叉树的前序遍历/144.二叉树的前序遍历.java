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
    public List<Integer> preorderTraversal(TreeNode root) {
            List<Integer> res = new ArrayList<Integer>();
            qianxu(root , res);
            return res;
    }
    public void qianxu(TreeNode root , List<Integer> res){
        if(root == null){
            return;
        }
        res.add(root.val);   //先访问根
        qianxu(root.left , res); //在访问左支
        qianxu(root.right , res);   //最后访问右支
    }
}