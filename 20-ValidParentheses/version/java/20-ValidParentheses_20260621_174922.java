// Last updated: 6/21/2026, 5:49:22 PM
1class Solution {
2    public boolean checkIfPangram(String sentence) {
3        boolean [] seen=new boolean[26];
4        int count=0;
5        for(char c: sentence.toCharArray()){
6            int index=c-'a';
7            if(!seen[index]){
8                seen[index]=true;
9
10                count++;
11            }
12            if(count==26){
13                return true;
14            }
15        }
16        return false;
17    }
18}