// Last updated: 8/20/2026, 6:01:28 PM
1class Solution {
2    public boolean isHappy(int n) {
3        int slow=n;
4        int fast= getNext(n);
5
6        while(fast != 1 && slow != fast){
7            slow= getNext(slow);
8            fast= getNext(getNext(fast));
9        }
10        return fast==1;
11    }
12    private int getNext(int n){
13        int sum=0;
14        while(n>0){
15            int d=n%10;
16            sum+=d*d;
17            n/=10;
18        }
19        return sum;
20    }
21}