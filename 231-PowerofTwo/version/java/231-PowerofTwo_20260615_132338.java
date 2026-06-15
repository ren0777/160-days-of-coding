// Last updated: 6/15/2026, 1:23:38 PM
1class Solution {
2    public boolean isIsomorphic(String s, String t) {
3        if(s.length() != t.length()){
4            return false;
5        }
6
7        HashMap<Character,Character> map=new HashMap<>();
8        for(int i=0;i<s.length();i++){
9            if(map.containsKey(s.charAt(i))){
10                if(map.get(s.charAt(i))==t.charAt(i)){
11                    continue;
12                }
13                else{
14                    return false;
15                }
16            }
17            else{
18                if(map.containsValue(t.charAt(i))){
19                    return false;
20                }
21                map.put(s.charAt(i),t.charAt(i));
22            }
23        }
24            return true;
25        
26    }
27}