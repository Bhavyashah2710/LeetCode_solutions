class Solution {
    public int[] sortArrayByParity(int[] nums) {
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i]%2==0) ans.add(nums[i]);
        }
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i]%2!=0) ans.add(nums[i]);
        }
        int index = 0 ;
        for(int n : ans){
            nums[index] = n ;
            index++;
        }
        return nums;
    }
}