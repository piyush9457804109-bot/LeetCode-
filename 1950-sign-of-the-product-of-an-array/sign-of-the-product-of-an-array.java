class Solution {
    public int arraySign(int[] nums) {
        int count=0;
        int zero=0;
        for(int val:nums){
            if(val<0) count++;
            if(val==0) zero++;
        }
        if(zero>0) return 0;
        if(count%2==0) return 1;
        return -1;
    }
}