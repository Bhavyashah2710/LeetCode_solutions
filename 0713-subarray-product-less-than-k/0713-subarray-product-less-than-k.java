class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if (k <= 1)    return 0; 
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int currentProduct = 1;
            for (int j = i; j < nums.length; j++) {
                currentProduct *= nums[j];
                if (currentProduct < k)      count++;
                else        break;
            }
        }      
        return count;
    }
}