class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] count = new int[101];
        
        // Step 1: Count frequency of each number
        for (int num : nums) {
            count[num]++;
        }
        
        // Step 2: Compute running sum to find how many numbers are strictly smaller
        for (int i = 1; i <= 100; i++) {
            count[i] += count[i - 1];
        }
        
        // Step 3: Construct the result array
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                result[i] = 0;
            } else {
                result[i] = count[nums[i] - 1];
            }
        }
        
        return result;
    }
}