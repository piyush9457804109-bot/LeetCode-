import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> list = new ArrayList<>();
        long ans = 1;
        list.add(1);
        
        for (int i = 1; i <= rowIndex; i++) {
            ans = ans * (rowIndex - i + 1);
            ans /= i; // Fixed: divide by i instead of 1
            list.add((int) ans);
        }
        
        return list;
    }
}