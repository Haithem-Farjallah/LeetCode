class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res=new ArrayList<>();
        res.add(List.of(1));
        for(int i=1;i<numRows;i++){
            List<Integer> temp=new ArrayList<>();
            temp.add(0);
            temp.addAll(res.get(res.size()-1));  //here i want to add 0 to both sides of the prev line 
            temp.add(0);
            List<Integer> row = new ArrayList<>();
            for(int j=1;j<temp.size();j++){
                row.add(temp.get(j)+temp.get(j-1));
            }
            res.add(row);
        }
        return res;
    }
}