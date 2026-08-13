class Solution {
    public int splitArray(int[] nums, int k) {
        int n = nums.length;
        int low = 0;
        int high = 0;
        for (int b : nums) {
            low = Math.max(low, b);
            high += b;
        }
        
        int v = high;
        while (low <= high) {
            int m = low + (high - low) / 2;
            int count = 1;
            int sum = 0;
            for (int b : nums) {
                if (sum + b <= m) {
                    sum += b;
                } else {
                    count++;
                    sum = b;
                }
            }
            if (count > k) {
                low = m + 1;
            } else {
                v = m;
                high = m - 1;
            }
        }
        return v;
    }
}
