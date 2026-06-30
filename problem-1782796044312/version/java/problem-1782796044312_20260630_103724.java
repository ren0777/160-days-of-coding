// Last updated: 6/30/2026, 10:37:24 AM
1class Solution {
2    public int lengthOfLastWord(String s) {
3        s=s.trim();
4        int sp=s.lastIndexOf(' ');
5        return s.length()-1-sp;
6    }
7}