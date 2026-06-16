// Last updated: 6/16/2026, 8:45:39 AM
class Solution {
    public double[] convertTemperature(double celsius) {
        double ans[]=new double[2];
        ans[0]=celsius+273.15;
        ans[1]=(celsius*1.80)+32.00;
        return ans;
    }
}