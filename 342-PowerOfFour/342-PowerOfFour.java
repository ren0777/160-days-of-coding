// Last updated: 7/4/2026, 10:55:26 PM
class Solution {
    public boolean isPowerOfFour(int n) {
        if(n<=0){
            return false;
        }
        if(n==1){
            return true;
        }

        return (n % 4== 0) && isPowerOfFour(n/4);
    }
}