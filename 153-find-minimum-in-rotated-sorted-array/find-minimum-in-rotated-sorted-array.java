class Solution {
    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        
        // If the array is already sorted (not rotated or rotated n times)
        if (nums[left] <= nums[right]) {
            return nums[left];
        }
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            // Check if the inflection/minimum point is at mid + 1 or mid
            if (mid < nums.length - 1 && nums[mid] > nums[mid + 1]) {
                return nums[mid + 1];
            }
            if (mid > 0 && nums[mid] < nums[mid - 1]) {
                return nums[mid];
            }
            
            // Decide whether to search in the left or right half
            if (nums[mid] >= nums[left]) {
                // Left half is sorted, so the minimum must be in the right half
                left = mid + 1;
            } else {
                // Right half is sorted, so the minimum is in the left half
                right = mid - 1;
            }
        }
        
        return nums[left];
    }
}