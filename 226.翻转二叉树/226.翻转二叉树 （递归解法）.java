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
//递归
class Solution {
    public TreeNode invertTree(TreeNode root) {
       if(root == null){
           return root;
       }
       TreeNode reverseleft = invertTree(root.left);
       TreeNode reverseright = invertTree(root.right);
       root.left = reverseright;
       root.right = reverseleft;
        return root;
    }
}