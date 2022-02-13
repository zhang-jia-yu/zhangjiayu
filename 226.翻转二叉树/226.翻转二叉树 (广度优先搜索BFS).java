//BFS 广度优先搜索
class Solution {
    public TreeNode invertTree(TreeNode root) {
       if(root == null){
           return root;
       }
       Queue<TreeNode> queue = new  ArrayDeque<TreeNode>();
       queue.offer(root); 
       while(!queue.isEmpty()){
           TreeNode tmp = queue.poll();
           TreeNode left = tmp.left;
           tmp.left = tmp.right;  
           tmp.right = left;
           if(tmp.left != null){
               queue.offer(tmp.left);
           }
           if(tmp.right != null){
               queue.offer(tmp.right);
           }
       }
       return root;
    }
}