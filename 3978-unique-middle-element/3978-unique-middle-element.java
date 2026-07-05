class Solution {
    public boolean isMiddleElementUnique(int[] nums) {
        int mid = 0+nums.length/2;
        int count=0;
        for(int c : nums){
            if(c==nums[mid]) count++;
        }
        return (count==1);
    }
}