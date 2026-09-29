class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int index = 0;
        
        // Determine which index to check based on ruleKey
        if (ruleKey.equals("color")) {
            index = 1;
        } else if (ruleKey.equals("name")) {
            index = 2;
        } // "type" defaults to index 0
        
        int count = 0;
        
        // Iterate through items and count matches
        for (List<String> item : items) {
            if (item.get(index).equals(ruleValue)) {
                count++;
            }
        }
        
        return count;
    }
}