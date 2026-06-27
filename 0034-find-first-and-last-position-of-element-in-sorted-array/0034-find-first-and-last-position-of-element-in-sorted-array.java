class Solution {
    public int[] searchRange(int[] nums, int target) {
        int ans[] = new int[2];
        int fo = -1;
        int lo = -1;
        int low = 0 ;
        int high = nums.length - 1;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(nums[mid]==target) {
                fo = mid;
                high = mid-1;
            }
            else if(nums[mid]<target) low = mid+1;
            else high = mid-1;
        }
        ans[0] = fo;
        low = 0; 
        high = nums.length -1 ;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(nums[mid]==target) {
                lo = mid;
                low = mid+1;
            }
            else if(nums[mid]<target) low = mid+1;
            else high = mid-1;
        }
        ans[1]= lo;
        return ans;        
    }
}