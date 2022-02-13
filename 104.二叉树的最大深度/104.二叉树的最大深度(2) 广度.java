// 广度优先搜索,手动创建新的容器存储。
class Solution {
    public int maxDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        Queue<TreeNode> queue = new LinkedList<TreeNode>();//LinkedList可以插入null值,ArrayDeque不允许插入空值
        queue.offer(root);    //在容量已满的情况下，add() 方法会抛出IllegalStateException异常，offer() 方法只会返回 false
        int maxdep = 0;
        while(!queue.isEmpty()){
            int size = queue.size();
            while(size > 0){
                TreeNode node = queue.poll();
                if(node.left != null){
                    queue.offer(node.left);
                }
                if(node.right != null){
                    queue.offer(node.right);
                }
                size--;
            }
            maxdep++;
        }
        return maxdep;
    }
}