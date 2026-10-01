import java.util.*;

class Solution {
    public int minOperations(int[] target, int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < target.length; i++) {
            map.put(target[i], i);
        }
        List<Integer> pos = new ArrayList<>();
        for (int num : arr) {
            if (map.containsKey(num)) {
                pos.add(map.get(num));
            }
        }
        List<Integer> lis = new ArrayList<>();
        for (int val : pos) {
            int idx = Collections.binarySearch(lis, val);
            if (idx < 0) {
                idx = -(idx + 1);
            }
            if (idx == lis.size()) {
                lis.add(val);
            } else {
                lis.set(idx, val);
            }
        }
        return target.length - lis.size();
    }
}