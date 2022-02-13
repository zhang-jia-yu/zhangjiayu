class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null){
            return false;
        }
        if(root.left == null && root.right ==null){   //终止条件，子树为空得时候结束
            return targetSum == root.val;
        }
        return hasPathSum(root.left , targetSum - root.val) || hasPathSum(root.right , targetSum - root.val);
    }
}