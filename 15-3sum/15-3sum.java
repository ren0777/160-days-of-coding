// Last updated: 6/16/2026, 8:48:20 AM
import java.util.*;
class Solution {
    public List<List<Integer>> threeSum(int[] ar) {
        Arrays.sort(ar);
        List<List<Integer>> res = new ArrayList<>();
        for(int i=0;i<ar.length-2;i++){
            if(i>0&&ar[i]==ar[i-1]){
                continue;
            }
            int left=i+1,right=ar.length-1;

            while(left<right){
                int sum=ar[i]+ar[left]+ar[right];
                if(sum==0){
                    res.add(Arrays.asList(ar[i],ar[left],ar[right]));
                
                    while(left<right && ar[left]==ar[left+1])left++;    
                    while(left<right && ar[right]==ar[right-1])right--;

                    left++;
                    right--;
                }else if(sum<0) left++;
                else right--;
            }
        }
        return res;
    }
}

