// Last updated: 6/16/2026, 8:45:18 AM
class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        Set<Integer> friendSet= new HashSet<>();
        for(int f :friends){
            friendSet.add(f);
        }

        int [] result =new int[friends.length];
        int index=0;

        for(int id:order){
            if(friendSet.contains(id)){
                result[index++]=id;
            }
        
        }

        return result;

    }
}