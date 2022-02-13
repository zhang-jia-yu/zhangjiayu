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

若root为空则跳出循环，并返回空节点;
若 val = root.val，则返回root；
若 val < root.val,将root置为root.left。
若 val > root.val,将root置为root.righ。
