// Last updated: 6/16/2026, 1:30:28 PM
// recursion approach
1class Solution {
2    int idx=0;
3    public String decodeString(String s) {
4        String ans="";
5        while(idx<s.length() && s.charAt(idx)!=']'){
6            char c=s.charAt(idx);
7            if(Character.isLetter(c)){
8                ans+=c;
9                idx++;
10            }
11            else{
12                int num=0;
13                while(Character.isDigit(s.charAt(idx))){
14                    num=num*10 + s.charAt(idx) - '0';
15                    idx++;
16                }
17                ++idx;
18                String s1=decodeString(s);
19                ++idx;
20                for(int i=0;i<num;i++){
21                    ans+=s1;
22                }
23            }
24        }
25        return ans;
26    }
27}