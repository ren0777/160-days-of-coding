// Last updated: 6/16/2026, 8:45:23 AM
class Solution {
    public int findPermutationDifference(String s, String t) {
        int d=0;
     for(int i =0;i<s.length();i++){
        int indexofs=i;
        int indexoft=t.indexOf(s.charAt(i));
        d+=Math.abs(indexoft-indexofs);
     }
     return d;
    }
}