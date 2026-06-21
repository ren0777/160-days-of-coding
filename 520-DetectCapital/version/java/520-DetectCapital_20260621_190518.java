// Last updated: 6/21/2026, 7:05:18 PM
// 1 ms approach
class Solution {
    public boolean detectCapitalUse(String word) {
        int ct = 0;
        for(char c : word.toCharArray()) {
            if(c>='A' && c<='Z') {
                ct++;
            }
        }
        if(ct==word.length() || ct==0) return true;
        return ct==1 && (word.charAt(0)>='A' && word.charAt(0)<='Z');
    }
}