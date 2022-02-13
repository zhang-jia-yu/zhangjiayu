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

 //此方法是在BFS(广度优先搜索方法上升级完成的层序遍历)
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        Queue<TreeNode> queue = new ArrayDeque<>();
        if(root != null){
            queue.add(root);
        }
        while(!queue.isEmpty()){
            int size = queue.size();  //队列大小
            List<Integer> level = new ArrayList<>();
            for(int i = 0; i < size; i++){     //无实际意义，表示一直循环下去，知道i>=size时结束循环
                TreeNode node = queue.poll();  //获取队列头部的元素，并删除该元素，如果此队列为空，则返回null。
                level.add(node.val);   
                if(node.left != null){
                    queue.add(node.left);     //如果node的左支不为空，则向queue队列里面添加元素
                }
                if(node.right != null){
                    queue.add(node.right);    //如果右支的左支不为空，则向queue队列里面添加元素
                }
                }
            }
             res.add(level);
        }
        return res;
    }
}