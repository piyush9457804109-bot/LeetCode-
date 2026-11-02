class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int low = 0;
        int high = arr.length - 1;
        
        while (low < high) {
            int mid = low + (high - low) / 2;
            
            // If the element at mid is smaller than the next element,
            // the peak must be on the right side.
            if (arr[mid] < arr[mid + 1]) {
                low = mid + 1;
            } 
            // Otherwise, the peak is at mid or on the left side.
            else {
                high = mid;
            }
        }
        
        // When low meets high, we've found our peak index.
        return low;
    }
}