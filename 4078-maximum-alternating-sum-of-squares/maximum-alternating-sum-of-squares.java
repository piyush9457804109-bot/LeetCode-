import java.util.Arrays;

class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n = nums.length;
        // Square all the elements and take absolute values to handle negative numbers
        long[] squared = new long[n];
        for (int i = 0; i < n; i++) {
            long val = nums[i];
            squared[i] = val * val;
        }
        
        // Sort the squared values in ascending order
        Arrays.sort(squared);
        
        long score = 0;
        int half = n / 2;
        
        // Subtract the smallest half of the squared values (even indices for subtraction in alternating sum)
        for (int i = 0; i < half; i++) {
            score -= squared[i];
        }
        
        // Add the largest half of the squared values (odd indices for addition in alternating sum)
        for (int i = half; i < n; i++) {
            score += squared[i];
        }
        
        return score;
    }
}