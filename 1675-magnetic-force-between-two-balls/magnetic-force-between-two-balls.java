import java.util.Arrays;

class Solution {
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int n = position.length;

        int low = 1;
        int high = position[n - 1] - position[0];
        int ans = 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (canPlaceBalls(position, m, mid)) {
                ans = mid;
                low = mid + 1; // Try for a larger minimum force/distance
            } else {
                high = mid - 1; // Reduce required minimum force/distance
            }
        }

        return ans;
    }

    private boolean canPlaceBalls(int[] position, int m, int minForce) {
        int ballsPlaced = 1;
        int lastPos = position[0];

        for (int i = 1; i < position.length; i++) {
            if (position[i] - lastPos >= minForce) {
                ballsPlaced++;
                lastPos = position[i];
                if (ballsPlaced == m) {
                    return true;
                }
            }
        }

        return false;
    }
}