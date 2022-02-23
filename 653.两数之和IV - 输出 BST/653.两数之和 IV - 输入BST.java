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
    public boolean findTarget(TreeNode root, int k) {
           Set <Integer> set = new HashSet<>();
           Queue<TreeNode> queue = new LinkedList<TreeNode>();
           queue.add(root);
           while(!queue.isEmpty()){
               if(queue.peek() != null){
               TreeNode node = queue.remove();
               if(set.contains(k - node.val)){
                   return true;  
               }
                   set.add(node.val);
                   queue.add(node.left);
                   queue.add(node.right);
               }else{
                   queue.remove();
               }
           } 
           return false;
    }
}