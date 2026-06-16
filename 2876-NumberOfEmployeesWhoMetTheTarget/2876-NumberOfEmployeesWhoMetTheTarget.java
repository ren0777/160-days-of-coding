// Last updated: 6/16/2026, 8:45:33 AM
class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        
        int count=0;
        for(int h:hours){
            if(h>=target)
            count++;
        }
        return count;
    }
}