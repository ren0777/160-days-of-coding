// Last updated: 6/21/2026, 6:42:35 PM
// 2 ms solution
1class Solution {
2    public boolean detectCapitalUse(String word) {
3        if(word.equals(word.toUpperCase())) return true;
4
5        if(word.equals(word.toLowerCase())) return true;
6
7        if(Character.isUpperCase(word.charAt(0)) && word.substring(1).equals(word.substring(1).toLowerCase()))
8        return true;
9
10        return false;
11    }
12}