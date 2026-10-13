import java.util.Arrays;

class Solution {
    public int findGCD(int[] nums) {
        // Find the minimum and maximum elements in the array
        int min = Arrays.stream(nums).min().getAsInt();
        int max = Arrays.stream(nums).max().getAsInt();
        
        // Return the greatest common divisor of min and max
        return gcd(min, max);
    }
    
    // Helper method to compute GCD using the Euclidean algorithm
    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}