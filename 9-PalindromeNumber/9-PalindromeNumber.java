// Last updated: 6/16/2026, 8:48:25 AM
class Solution {
    public boolean isPalindrome(int x) {
        int num=x,sum=0;
        while(x>0){
            int d=x%10;
            sum=sum*10+d;
            x/=10;
        }
        return (sum==num);       
    }
}