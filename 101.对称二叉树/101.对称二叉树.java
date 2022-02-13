//  递归
class Solution {
    public boolean isSymmetric(TreeNode root) {
          return check(root , root);
    }
    public boolean check(TreeNode n , TreeNode u){
        if(n == null && u == null){
            return true;
        }
         if(n == null || u == null){
            return false;
        }
        return n.val == u.val && check(n.left , u.right) && check(n.right , u.left);
    }
}