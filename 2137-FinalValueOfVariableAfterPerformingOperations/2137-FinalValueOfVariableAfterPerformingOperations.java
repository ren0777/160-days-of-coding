// Last updated: 6/16/2026, 8:45:45 AM
class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int x=0;
        for(String operation :operations){
            switch(operation){
                case "--X":
                case "X--":
                --x;
                break;
                case "++X" :
                case "X++":
                ++x;
                break;
            }
        }
        return x;

    }
}