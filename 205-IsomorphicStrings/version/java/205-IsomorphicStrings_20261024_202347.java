// Last updated: 10/24/2026, 8:23:47 PM
1class Solution {
2    public boolean isIsomorphic(String s, String t) {
3        if(s.length() != t.length()) return false;
4
5        int[] lastS=new int[256];
6        int[] lastT=new int[256];
7
8        for(int i=0;i<s.length();i++){
9            char a=s.charAt(i), b=t.charAt(i);
10            if(lastS[a] != lastT[b]) return false;
11            lastS[a]= i+1;
12            lastT[b]=i+1;
13        }
14        return true;
15    }
16}