class Solution {
    public int missingNumber(int[] nums) {
        int s=0;
        int snums=0;
        int n=1;
        for(int i=0;i<nums.length;i++){
            s+=n;
            n++;
            snums+=nums[i];
        }
        return s-snums;
        
    }
}