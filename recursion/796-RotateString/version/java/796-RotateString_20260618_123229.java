// Last updated: 6/18/2026, 12:32:29 PM
1class Solution {
2    public boolean rotateString(String s, String goal) {
3        if(s.length() !=goal.length()) return false;
4        
5        String doubleS=s+s;
6
7        return doubleS.contains(goal);
8    }
9}