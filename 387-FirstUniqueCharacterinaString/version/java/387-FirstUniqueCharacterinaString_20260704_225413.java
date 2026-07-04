// Last updated: 7/4/2026, 10:54:13 PM
1class Solution {
2    public int firstUniqChar(String s) {
3        int[] charCount=new int[26];
4
5        for(int i=0;i<s.length();i++){
6            charCount[s.charAt(i)-'a']++;
7        }
8
9        for(int i=0;i<s.length();i++){
10            if(charCount[s.charAt(i)-'a']==1) return i;
11        }
12        return -1;
13    }
14}