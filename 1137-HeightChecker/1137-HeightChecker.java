// Last updated: 7/4/2026, 10:55:04 PM
class Solution {
    public int heightChecker(int[] heights) {
        int[] expected=heights.clone();

        Arrays.sort(expected);

        int count=0;
        for(int i=0;i<heights.length;i++){
            if(heights[i] != expected[i]){
                count++;
            }
        }
        return count;

    }
}