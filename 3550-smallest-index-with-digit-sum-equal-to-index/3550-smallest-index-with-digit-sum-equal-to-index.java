class Solution {
    public int smallestIndex(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int sd=0;
            while(nums[i]!=0){
               sd+=nums[i]%10;
               nums[i]/=10; 
            }
            if(sd==i) return i;
        }
        return -1;
        
    }
}