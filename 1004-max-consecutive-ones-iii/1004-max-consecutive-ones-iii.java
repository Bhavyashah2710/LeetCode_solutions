class Solution {
    public int longestOnes(int[] nums, int k) {
        int l = 0 ;
        int v = 0 ;
        int b = 0 ;
        int n = nums.length ;
        for(int r = 0 ; r < n ; r++){
            b += nums[r];
            while(b+k < r-l+1){
                b -= nums[l] ;
                l++ ;
            }
            v = Math.max(v,r-l+1);           
        }
        return v ;
    }
}