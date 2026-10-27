class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        if (mat == null || mat.length == 0 || mat[0].length == 0) {
            return new int[0];
        }
        
        int m = mat.length;
        int n = mat[0].length;
        int[] result = new int[m * n];
        
        int row = 0, col = 0;
        // Direction flag: 1 means moving up-right, -1 means moving down-left
        int direction = 1; 
        
        for (int i = 0; i < m * n; i++) {
            result[i] = mat[row][col];
            
            if (direction == 1) {
                // Moving up-right
                if (col == n - 1) {
                    row++;          // Hit the right wall, move down
                    direction = -1; // Change direction to down-left
                } else if (row == 0) {
                    col++;          // Hit the top wall, move right
                    direction = -1; // Change direction to down-left
                } else {
                    row--;
                    col++;
                }
            } else {
                // Moving down-left
                if (row == m - 1) {
                    col++;          // Hit the bottom wall, move right
                    direction = 1;  // Change direction to up-right
                } else if (col == 0) {
                    row++;          // Hit the left wall, move down
                    direction = 1;  // Change direction to up-right
                } else {
                    row++;
                    col--;
                }
            }
        }
        
        return result;
    }
}