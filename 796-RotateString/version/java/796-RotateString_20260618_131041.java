// Last updated: 6/18/2026, 1:10:41 PM
1class Solution {
2    public String reverseWords(String s) {
3       String[] words=s.trim().split("\\s+");
4
5       StringBuilder rev=new StringBuilder();
6
7       for(int i=words.length-1;i>=0;i--){
8        rev.append(words[i]);
9        if(i !=0){
10            rev.append(" ");
11        }
12       }
13       return rev.toString();
14    }
15}