class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null){
            return false;
        }
        Queue<TreeNode> queue = new ArrayDeque<TreeNode>();
        Queue<Integer> queval = new ArrayDeque<>();
        queue.offer(root);
        queval.offer(root.val);
        while(!queue.isEmpty()){
            TreeNode node = queue.poll(); 
            int tmp = queval.poll();
            if(node.left == null && node.right == null){
            if(tmp == targetSum){
                return true;
            }
            continue;
            }
            
            if(node.left != null){
                queue.offer(node.left);
                queval.offer(node.left.val + tmp);
            }
             if(node.right != null){
                queue.offer(node.right);
                queval.offer(node.right.val + tmp);
            }
            
        }return false;
}
}