// Last updated: 6/16/2026, 8:48:22 AM
class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String first = strs[0];
        String last = strs[strs.length-1];
        int i=Math.min(first.length(),last.length());
        int j=0;
        while(j<i && first.charAt(j)==last.charAt(j)){
            j++;
        }
        return first.substring(0,j);
    }
    
}