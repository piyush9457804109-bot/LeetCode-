class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = 0;
        for (int val : piles) {
            high = Math.max(high, val);
        }

        int ans = high;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (isPossible(piles, h, mid)) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    private boolean isPossible(int[] piles, int h, int speed) {
        long totalHours = 0;
        for (int pile : piles) {
            totalHours += (pile + speed - 1L) / speed;
            if (totalHours > h) {
                return false;
            }
        }
        return totalHours <= h;
    }
}