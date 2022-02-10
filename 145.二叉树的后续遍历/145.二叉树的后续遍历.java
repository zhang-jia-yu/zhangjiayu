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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        houxu(root , res);
        return res;
    }
    public void houxu(TreeNode root , List<Integer> res){
        if(root == null){
            return;
        }
        houxu(root.left , res);  //先访问坐支
        houxu(root.right , res);  //在访问右支
        res.add(root.val);       //最后访问根
    }
}
//递归算法