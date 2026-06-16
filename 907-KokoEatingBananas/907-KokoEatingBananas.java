// Last updated: 6/16/2026, 8:46:24 AM
class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = 0;

        // find the largest pile for upper bound
        for (int pile : piles) {
            right = Math.max(right, pile);
        }

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (canEat(piles, mid, h)) {
                right = mid - 1; // try smaller k
            } else {
                left = mid + 1;  // need bigger k
            }
        }
        return left;
    }

    public boolean canEat(int[] piles, int k, int h) {
        long hours = 0; // use long to avoid overflow
        for (int pile : piles) {
            hours += (pile + k - 1) / k; // ceil(pile/k)
            if (hours > h) return false; // prune early
        }
        return hours <= h;
    }
}
