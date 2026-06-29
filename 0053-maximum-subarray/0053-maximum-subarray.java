class Solution {
    public int maxSubArray(int[] nums) {
        int m = Integer.MIN_VALUE ;
        int cs = 0;
        for(int num : nums){
            cs += num ;
            m = Math.max(m,cs);
            if(cs < 0) cs=0;
        }
        return m;
    }
}