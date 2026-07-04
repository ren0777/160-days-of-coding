// Last updated: 7/4/2026, 10:55:17 PM
class Solution {
    public boolean detectCapitalUse(String word) {
        int cnt=0;
        for(char c: word.toCharArray()){
            if(c>='A' && c<='Z'){
                cnt++;
            }
        }
            if(cnt==word.length() || cnt==0) return true;
            return (cnt==1 &&(word.charAt(0)>='A' && word.charAt(0)<='Z'));
        
    }
}