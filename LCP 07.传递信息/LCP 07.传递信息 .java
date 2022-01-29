class Solution {
    public int numWays(int n, int[][] relation, int k) {
        //n:玩家个数  relation:玩家编号与对应可传递玩家编号  K: (K)轮次
        int end = 0;
        int len = relation.length - 1;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < 2; j++) {
                if (relation[0][1] != relation[i+1][j] && relation[i+1][j] != relation[i+2][j]){
                    end++;
                    return end; 
                }else{
                    return end;
                }
            }

        }
        return end;
    }
}