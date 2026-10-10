import java.util.HashMap;

class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer, Integer> remainderCount = new HashMap<>();
        remainderCount.put(0, 1);
        int prefixSum = 0;
        int count = 0;
        for (int num : nums) {
            prefixSum += num;
            int rem = prefixSum % k;
            if (rem < 0) {
                rem += k;
            }
            if (remainderCount.containsKey(rem)) {
                count += remainderCount.get(rem);
            }
            remainderCount.put(rem, remainderCount.getOrDefault(rem, 0) + 1);
        }
        return count;
    }
}