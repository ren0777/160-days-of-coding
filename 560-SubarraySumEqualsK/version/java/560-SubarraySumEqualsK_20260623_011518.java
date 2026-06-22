// Last updated: 6/23/2026, 1:15:18 AM
// 4ms
1class Solution {
2    public int heightChecker(int[] heights) {
3        int[] expected=heights.clone();
4
5        Arrays.sort(expected);
6
7        int count=0;
8        for(int i=0;i<heights.length;i++){
9            if(heights[i] != expected[i]){
10                count++;
11            }
12        }
13        return count;
14
15    }
16}