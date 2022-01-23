class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> yanghui = new ArrayList<List<Integer>>();
        for(int i = 0; i<35; i++){
            List<Integer> row = new ArrayList<Integer>();
            for(int j = 0; j<=i; j++){
                if(j == 0 || i == j){
                    row.add(1);
                }else{
                    row.add(yanghui.get(i-1).get(j-1) + yanghui.get(i-1).get(j));
                }
            }
            yanghui.add(row);
        }
        return yanghui.get(rowIndex);
    }
}