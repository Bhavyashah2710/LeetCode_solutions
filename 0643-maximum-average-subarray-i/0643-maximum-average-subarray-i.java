class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        int b = 0 ;
        for(int i = 0 ; i < k ; i++) b+=nums[i];
        int v = b;
        for(int i = k ; i < n ; i++) {
            b = b - nums[i-k] + nums[i] ;
            if(b>v) v = b;
        } 
        return (double) v / k ;
    }
}