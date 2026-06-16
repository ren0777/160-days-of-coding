// Last updated: 6/16/2026, 8:45:44 AM
class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        Queue<Integer> q=new LinkedList<>();
        int timer = 0;
        for(int  i=0;i<tickets.length;i++){
            q.add(i);
        }
        while(!q.isEmpty()){
            int index=q.poll();
            timer++;
            tickets[index]--;
            if(k==index && tickets[index]==0) break;
            if(tickets[index]!=0){
                q.add(index);
            }
        }
        return timer;
    }
}
