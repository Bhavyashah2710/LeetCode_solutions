class Solution {
    public int dominantIndex(int[] nums) {
        int lar = 0;
        int slar = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > lar) {
                slar = lar;
                lar = nums[i];
            }
            else if (nums[i] > slar) {
                slar = nums[i];
            }
        }          
        if (lar >= 2 * slar) {
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == lar) return i;
            }   
        }
        return -1;  
    }
}