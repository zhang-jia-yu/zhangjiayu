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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        zhongxu(root , res);
        return res;
    }
    public void zhongxu(TreeNode root , List<Integer> res){
        if(root == null){
            return;
        }
        zhongxu(root.left , res);  //先访问左支
        res.add(root.val);    	   //在访问根
        zhongxu(root.right , res); //最后访问右支
    }
}