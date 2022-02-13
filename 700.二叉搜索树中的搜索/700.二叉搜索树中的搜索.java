class Solution {
    public TreeNode searchBST(TreeNode root, int val) {
        if(root == null){
            return root;
        }
        while(root != null){
            if(root.val == val){
                return root;
            }
            root = val < root.val ? root.left : root.right;
        }
        return root;
    }
}