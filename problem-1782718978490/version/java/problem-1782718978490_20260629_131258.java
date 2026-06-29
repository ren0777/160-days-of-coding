// Last updated: 6/29/2026, 1:12:58 PM
1class Solution {
2    public List<Integer> getRow(int rowIndex) {
3
4        List<Integer> row=new ArrayList<>();
5        row.add(1);
6        for(int i=1;i<=rowIndex;i++){
7            row.add(1);
8            for(int j=i-1;j>0;j--){
9                row.set(j,row.get(j)+row.get(j-1));
10            }
11        }
12        return row;
13    }
14}