// Last updated: 6/16/2026, 8:46:13 AM
class Solution {
    public int findJudge(int n, int[][] trust) {
        int[] arr=new int[n+1];
        for( int[] t : trust ){
            int a=t[0];
            int b=t[1];

            arr[a]--;
            arr[b]++;
        }
            for(int i=1;i<=n;i++){
                if(arr[i]==n-1) return i;
            }   
        
        return -1;
    }

}