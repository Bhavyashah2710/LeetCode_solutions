class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int mO = 0;
        int cCount = 0;        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                cCount++;
                mO = Math.max(mO, cCount);
            } else {
                cCount = 0;
            }
        }
        
        return mO;
    }
}