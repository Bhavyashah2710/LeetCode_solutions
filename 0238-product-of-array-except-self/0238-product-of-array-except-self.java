class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] b = new int[n];
        int p = 1;
        int zC = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] == 0)
                zC++;
            else
                p *= nums[i];
        }
        for (int i = 0; i < n; i++) {
            if (zC > 1)
                b[i] = 0;
            else if (zC == 1) {
                if (nums[i] == 0)
                    b[i] = p;
                else
                    b[i] = 0;
            }else
                b[i] = p / nums[i];
        }
        return b;
    }
}