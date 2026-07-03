import java.util.Arrays;

class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums == null || nums.length == 0) return 0;        
        Arrays.sort(nums);
        int co = 1;
        int maxco = 1;        
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1])     continue;
            else if (nums[i + 1] == nums[i] + 1)    co++;
            else {
                maxco = Math.max(maxco, co);
                co = 1;
            }
        }        
        return Math.max(maxco, co);
    }
}