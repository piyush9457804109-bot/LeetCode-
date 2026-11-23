class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int n = bloomDay.length;
        if ((long) m * k > n) {
            return -1;
        }

        int low = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;
        for (int day : bloomDay) {
            if (day < low) low = day;
            if (day > high) high = day;
        }

        while (low < high) {
            int mid = low + (high - low) / 2;
            if (canMakeBouquets(bloomDay, m, k, mid)) {
                high = mid; // mid works, try to find an earlier day
            } else {
                low = mid + 1; // need more days for flowers to bloom
            }
        }

        return low;
    }

    private boolean canMakeBouquets(int[] bloomDay, int m, int k, int day) {
        int bouquets = 0;
        int adjacentBloomed = 0;

        for (int bloom : bloomDay) {
            if (bloom <= day) {
                adjacentBloomed++;
                if (adjacentBloomed == k) {
                    bouquets++;
                    adjacentBloomed = 0;
                    if (bouquets >= m) {
                        return true;
                    }
                }
            } else {
                adjacentBloomed = 0;
            }
        }

        return bouquets >= m;
    }
}