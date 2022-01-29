class Solution {
    public int maxTurbulenceSize(int[] arr) {
        int len = arr.length;
        int[] up = new int[len] , down = new int[len];
        Arrays.fill(up , 1);
        Arrays.fill(down , 1);
        int ans = 1;
        for (int i = 1; i < len; i++) {
            if (arr[i] > arr[i - 1]){
                up[i] = down[i - 1] + 1;
                ans = Math.max(ans , up[i]);
            }else if (arr[i] < arr[i - 1]){
                down[i] = up[i - 1] + 1;
                ans= Math.max(ans , down[i]);
            }
        }
        return ans;
    }
}