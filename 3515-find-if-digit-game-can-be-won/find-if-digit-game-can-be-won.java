class Solution {
    public boolean canAliceWin(int[] nums) {
        int single=0;
        int doub=0;
        for(int val:nums){
            if(val<10){
                single+=val;
            }else{
                doub+=val;
            }
        }
        return (single>doub) || (doub>single);
    }
}