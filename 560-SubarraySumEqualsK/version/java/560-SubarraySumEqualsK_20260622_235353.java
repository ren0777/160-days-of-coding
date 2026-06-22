// Last updated: 6/22/2026, 11:53:53 PM
// 25ms
1class Solution {
2    public int subarraySum(int[] nums, int k) {
3    HashMap <Integer, Integer> sum=new HashMap<>();
4
5    sum.put(0,1);
6
7    int currentSum=0;
8    int count=0;    
9    
10    for(int num : nums){
11        currentSum+=num;
12
13        if(sum.containsKey(currentSum-k)){
14            count+=sum.get(currentSum-k);
15        }
16        
17        sum.put(currentSum,sum.getOrDefault(currentSum,0)+1);
18    }
19    return count;
20  }
21}