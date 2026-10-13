class Solution {
    public int arraySign(int[] nums) {
        int negativeCount = 0;
        
        for (int num : nums) {
            if (num == 0) {
                return 0;
            }
            if (num < 0) {
                negativeCount++;
            }
        }
        
        // If negative count is even, return 1; otherwise return -1
        return (negativeCount % 2 == 0) ? 1 : -1;
    }
}