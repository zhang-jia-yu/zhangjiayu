class Solution {
    public List<List<Integer>> permute(int[] nums) {
        int len = nums.length;
        List<List<Integer>> res = new ArrayList<>();
        if (len == 0) {
            return res;
        }
        Deque<Integer> Path = new ArrayDeque<>();
        boolean[] used = new boolean[len];
        dfs(nums, len, 0, Path, used, res);
        return res;
    }

    private void dfs(int[] nums, int len, int depth, Deque<Integer> Path, boolean[] used, List<List<Integer>> res) {
        if (depth == len) {
            res.add(new ArrayList<>(Path));
            return;
        }
        for (int i = 0; i < len; i++) {
            if (used[i]) {
                continue;
            }
            Path.addLast(nums[i]);
            used[i] = true;
            dfs(nums, len, depth + 1, Path, used, res);
            Path.removeLast();
            used[i] = false;
        }
    }
}