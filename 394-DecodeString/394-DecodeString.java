// Last updated: 7/4/2026, 10:55:19 PM
class Solution {
    int idx=0;
    public String decodeString(String s) {
        String ans="";
        while(idx<s.length() && s.charAt(idx)!=']'){
            char c=s.charAt(idx);
            if(Character.isLetter(c)){
                ans+=c;
                idx++;
            }
            else{
                int num=0;
                while(Character.isDigit(s.charAt(idx))){
                    num=num*10 + s.charAt(idx) - '0';
                    idx++;
                }
                ++idx;
                String s1=decodeString(s);
                ++idx;
                for(int i=0;i<num;i++){
                    ans+=s1;
                }
            }
        }
        return ans;
    }
}