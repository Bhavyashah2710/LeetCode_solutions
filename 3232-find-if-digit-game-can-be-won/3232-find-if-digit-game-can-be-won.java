class Solution {
    public boolean canAliceWin(int[] nums) {
        int sds=0;
        int dds=0;
        for(int i=0;i<nums.length;i++){
            if (nums[i]<=9) sds+=nums[i];
            else dds+=nums[i];
        }
        if(sds > dds) return true;
        else if (sds < dds) return true; 
        
    return false;
    }
}