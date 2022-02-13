 //深度优先搜索，利用了库内自带的栈来存储。
class Solution {
    public int maxDepth(TreeNode root) {
        if(root == null){
            return 0;
        }else{
            int maxleft = maxDepth(root.left);
            int maxright = maxDepth(root.right);
            return Math.max(maxleft , maxright) + 1;
        }
        
    }
}