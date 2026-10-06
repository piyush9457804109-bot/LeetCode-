import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        
        List<Integer> result = new ArrayList<>();
        
        for (int i = 0; i < m; i++) {
            int minVal = matrix[i][0];
            int colIdx = 0;
            
            for (int j = 1; j < n; j++) {
                if (matrix[i][j] < minVal) {
                    minVal = matrix[i][j];
                    colIdx = j;
                }
            }
            boolean isMaxInCol = true;
            for (int k = 0; k < m; k++) {
                if (matrix[k][colIdx] > minVal) {
                    isMaxInCol = false;
                    break;
                }
            }
            
            if (isMaxInCol) {
                result.add(minVal);
            }
        }
        
        return result;
    }
}