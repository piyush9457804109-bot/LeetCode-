class Solution {
    public int nearestValidPoint(int x, int y, int[][] points) {
        int minDistance = Integer.MAX_VALUE;
        int minIndex = -1;

        for (int i = 0; i < points.length; i++) {
            int px = points[i][0];
            int py = points[i][1];

            // Check if the point is valid (shares either x or y coordinate)
            if (px == x || py == y) {
                int distance = Math.abs(px - x) + Math.abs(py - y);

                // Update if we find a strictly smaller distance
                if (distance < minDistance) {
                    minDistance = distance;
                    minIndex = i;
                }
            }
        }

        return minIndex;
    }
}