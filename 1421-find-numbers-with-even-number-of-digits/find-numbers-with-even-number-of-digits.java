class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            // Convert the integer to a string and check if its length is even
            if (String.valueOf(num).length() % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}