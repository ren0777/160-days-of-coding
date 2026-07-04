// Last updated: 7/4/2026, 10:54:52 PM
class Solution {
    public int largestAltitude(int[] gain) {
        int maxAl=0;
        int currentAl=0;
        for(int change:gain){
            currentAl += change;

            maxAl=Math.max(maxAl,currentAl);
        }
        return maxAl;
    }
}