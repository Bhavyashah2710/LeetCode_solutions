class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        ArrayList<Integer> eve = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i]%2==0) eve.add(nums[i]);
        }
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i]%2!=0) odd.add(nums[i]);
        }
        int eveindex = 0 ;
        int oddindex = 0 ;
        for(int i = 0 ; i < nums.length ;i++){
            if(i%2==0)   {
                nums[i] = eve.get(eveindex) ;
                eveindex++;
            }
            else {
                nums[i] = odd.get(oddindex);
                oddindex++;
        }
        }
        return nums;
    }
}