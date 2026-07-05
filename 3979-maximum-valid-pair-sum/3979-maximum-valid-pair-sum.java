class Solution {
    public int maxValidPairSum(int[] nums, int k) {
        int i = 0 ;
        int j = k ;
        int ans = Integer.MIN_VALUE ;
        int max = nums[0];
        while(j<nums.length){
            max = Math.max(max,nums[i]);
            ans = Math.max(ans,max+nums[j]);
            i++;
            j++;
        }
        return ans;
    }
}