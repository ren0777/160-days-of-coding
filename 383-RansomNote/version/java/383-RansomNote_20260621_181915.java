// Last updated: 6/21/2026, 6:19:15 PM
// hashmap
1class Solution {
2    public boolean canConstruct(String ransomNote, String magazine) {
3        HashMap <Character,Integer> charCount=new HashMap<>();
4
5        for(char c:magazine.toCharArray()){
6            charCount.put(c,charCount.getOrDefault(c,0)+1);
7        }
8        for(char c: ransomNote.toCharArray()){
9            if(!charCount.containsKey(c) || charCount.get(c)==0){
10                return false;
11            }
12            charCount.put(c,charCount.get(c)-1);
13        }
14        return true;
15    }
16}