class Solution {
    public void setZeroes(int[][] matrix) {
        int x = matrix.length;
        int y = matrix[0].length;
        boolean[] row = new boolean[x];  //判断当前位置是否为零
        boolean[] col = new boolean[y];  //同上
        if (x == 0){
            System.out.println(matrix);
        }
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                if (matrix[i][j] == 0){
                    row[i] = col[j] = true;
                }
            }

        }
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                if (row[i] || col[j]){    //如果当前判断为零，则数组同样所在的那一行、一列为零。
                    matrix[i][j] = 0;
                    System.out.println(matrix);
                }
            }
        }
    }
}