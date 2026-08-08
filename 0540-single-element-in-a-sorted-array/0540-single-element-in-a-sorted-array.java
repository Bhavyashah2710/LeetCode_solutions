class Solution {
    public int singleNonDuplicate(int[] nums) {
        int v = 0 ; 
        for(int n : nums){
            v ^= n ;
        }
        return v ;
    }
}