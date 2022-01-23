class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> yanghui = new ArrayList<List<Integer>>();
        for(int i = 0; i<numRows; i++){
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
        return yanghui;
    }
}