// Last updated: 6/18/2026, 12:43:26 PM
1class Solution {
2    public int maxDepth(String s) {
3        int maxDepth=0;
4        int currentDepth=0;
5
6        for(char c:s.toCharArray()){
7            if(c == '('){
8                currentDepth++;
9                maxDepth=Math.max(currentDepth,maxDepth);
10            }
11            else if(c==')'){
12                currentDepth--;
13            }
14        }return maxDepth;
15    }
16}