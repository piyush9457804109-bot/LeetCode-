class Solution {
    public int countOdds(int low, int high) {
        // The total number of integers between low and high (inclusive)
        int totalNumbers = high - low + 1;
        
        // If the total count is even, there are an equal number of evens and odds
        if (totalNumbers % 2 == 0) {
            return totalNumbers / 2;
        } else {
            // If the total count is odd, check if either low or high is odd
            // If so, the extra number in the range must be an odd number
            if (low % 2 != 0 || high % 2 != 0) {
                return (totalNumbers / 2) + 1;
            } else {
                return totalNumbers / 2;
            }
        }
    }
}