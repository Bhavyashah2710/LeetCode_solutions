class Solution {
    public int minElement(int[] nums) {
        int min= 10000;
        for(int i=0;i<nums.length;i++){
            int sd=0;
            while(nums[i]!=0) {
                sd+=nums[i]%10;
                nums[i]/=10;
            }
            if(sd<min) min=sd;
        }
        return min;        
    }
}