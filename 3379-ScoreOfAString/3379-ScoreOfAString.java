// Last updated: 6/16/2026, 8:45:24 AM
class Solution {
    public int scoreOfString(String s) {
        int c=0;
        for(int i=0;i<s.length()-1;i++){
            int abs=(int)(s.charAt(i))-(int)(s.charAt(i+1));
            c+=Math.abs(abs);
        }
        return c;

        
    }
}