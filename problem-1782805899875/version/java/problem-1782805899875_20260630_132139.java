// Last updated: 6/30/2026, 1:21:39 PM
1class Solution {
2    public boolean wordPattern(String pattern, String s) {
3        String arr[]=s.trim().split("\\s+");
4        HashMap<Character,String>hm=new HashMap<>();
5        if(pattern.length() != arr.length) return false;
6
7        for(int i=0;i<pattern.length();i++){
8            char ch=pattern.charAt(i);
9            if(hm.containsKey(ch)){
10                if(!hm.get(ch).equals(arr[i])) return false;
11            }
12            else{
13                if(hm.containsValue(arr[i]))
14                return false;
15
16                hm.put(ch,arr[i]);
17            }
18        }
19        return true;
20    }
21}