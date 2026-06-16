// Last updated: 6/16/2026, 8:46:57 AM
class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n<=0) return false;
        while(n!=1){
            if(n%2==0){
                n/=2;

            }
            else{
                return false;
            }
        }
        return true;
    }
}