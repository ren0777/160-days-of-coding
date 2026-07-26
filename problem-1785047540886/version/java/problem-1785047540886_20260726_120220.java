// Last updated: 7/26/2026, 12:02:20 PM
1class Solution {
2    public boolean isSubsequence(String s, String t) {
3
4        if(s.isEmpty()) return true;
5        
6        int s1=0;
7        int t1=0;
8        int l=s.length();
9
10        for(int i=0;i<t.length();i++){
11            if(s.charAt(s1)==t.charAt(i)){
12                ++s1;
13                if(s1==l) return true;
14            }
15        }
16        return false;
17    }
18}