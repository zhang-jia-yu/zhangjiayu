class Solution {
    public TreeNode searchBST(TreeNode root, int val) {
        if(root == null){
            return root;
        }
        while(root != null){
            if(root.val == val){
                return root;
            }
            root = val < root.val ? root.left : root.right;   //A ？ B ：C (如果A为真执行B否则执行C)
        }
        return root;
    }
}