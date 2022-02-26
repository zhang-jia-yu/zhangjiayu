class Solution {
    public int minDepth(TreeNode root) {
     int mindepth = Integer.MAX_VALUE;
     if(root == null){
         return 0;
     } 
     if(root.left == null && root.right == null){
         return 1;
     }
     if(root.left != null){
         mindepth = Math.min(minDepth(root.left) , mindepth);
     }
     if(root.right != null){
         mindepth = Math.min(minDepth(root.right), mindepth);
     }
     return mindepth + 1;
    }
}