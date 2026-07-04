// Last updated: 7/4/2026, 10:46:42 PM
1class Solution {
2    public int firstUniqChar(String s) {
3        HashMap<Character,Integer> single=new HashMap<>();
4
5        for(int i=0;i<s.length();i++){
6            char c=s.charAt(i);
7            single.put(c,single.getOrDefault(c,0)+1);
8        }
9            for(int i=0;i<s.length();i++){
10                if(single.get(s.charAt(i))==1){
11                    return i;
12                }        
13            }
14
15        return -1;
16    }
17}