class Solution {
    public int countMajoritySubarrays(int[] nums, int target) {
        int ans = 0;
        for (int l = 0; l < nums.length; l++) {
            int targetCount = 0;
            for (int r = l; r < nums.length; r++) {
                if (nums[r] == target)  targetCount++;
                int len = r - l + 1;
                if (targetCount > len / 2)  ans++;
            }
        }
        return ans;
    }
}