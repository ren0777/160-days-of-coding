// Last updated: 6/21/2026, 6:28:46 PM
// Array data structure
1class Solution {
2    public boolean canConstruct(String ransomNote, String magazine) {
3        if(ransomNote.length()>magazine.length()) return false;
4
5        int[] charCount=new int[26];
6
7        for(char c:magazine.toCharArray()){
8            charCount[c-'a']++;
9        }
10        for(char c : ransomNote.toCharArray()){
11            if(charCount[c-'a']==0){
12                return false;
13            }
14            charCount[c-'a']--;
15        }
16        return true;
17    }
18}